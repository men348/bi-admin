package com.chinadaas.platform.bi.server.schedule;

import com.chinadaas.platform.bi.model.domain.JobQuery;
import com.chinadaas.platform.bi.model.dto.EnterpriseBaseInfoDTO;
import com.chinadaas.platform.bi.model.enums.JobStatusEnum;
import com.chinadaas.platform.bi.model.enums.JobTypeEnum;
import com.chinadaas.platform.bi.model.util.EnterpriseUtil;
import com.chinadaas.platform.bi.server.entity.Job;
import com.chinadaas.platform.bi.server.entity.JobFile;
import com.chinadaas.platform.bi.server.service.EnterpriseService;
import com.chinadaas.platform.bi.server.service.JobService;
import com.chinadaas.platform.bi.server.util.JobProperties;
import com.chinadaas.platform.common.util.BeanUtil;
import com.chinadaas.platform.order.model.enums.OrderFrom;
import com.chinadaas.platform.order.model.enums.OrderKeyType;
import com.chinadaas.platform.order.model.enums.OrderState;
import com.chinadaas.platform.order.model.enums.OrderType;
import com.chinadaas.platform.order.model.vo.OrderVO;
import com.chinadaas.platform.user.client.UserClient;
import com.chinadaas.platform.user.model.dto.UserColDTO;
import com.chinadaas.platform.user.model.reponse.ColumnListResponse;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.dom.DOMDocument;
import org.dom4j.dom.DOMElement;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.util.StringUtils;

import java.io.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by xie on 16/8/2.
 */
public class JobExecutor implements org.quartz.Job {

    private static final Log LOG = LogFactory.getLog(JobExecutor.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobService service = (JobService) AppContext.getBean(JobService.class);
        EnterpriseService entService = (EnterpriseService) AppContext.getBean(EnterpriseService.class);
        UserClient userClient = (UserClient) AppContext.getBean(UserClient.class);

        //获取参数, 执行任务
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        JobDetail jobDetail = jobExecutionContext.getJobDetail();
        Job job = (Job) jobDetail.getJobDataMap().get("job");

        //TODO, 根据userId获得用户权限
        List<String> columnBasic = new LinkedList<>();  //用来存储基本信息字段
        List<String> columnInv = new LinkedList<>();
        List<String> columnPerson = new LinkedList<>();

        ColumnListResponse cl = userClient.queryColumnsByUserIdAndProductCode(job.getUserId(), EnterpriseUtil.PRODUCT_CODE);
        List<UserColDTO> colDTOs = cl.getColumns();
        for (UserColDTO dto : colDTOs) {
            String columnCode = dto.getColumnId();
            if (StringUtils.isEmpty(columnCode) || !columnCode.contains(".")) {
                continue;
            }
            String[] columnInfo = columnCode.split("\\.");
            if (columnInfo[0].equals(EnterpriseUtil.BASIC)) {
                columnBasic.add(columnInfo[1]);
            } else if (columnInfo[0].equals(EnterpriseUtil.INV)) {
                columnInv.add(columnInfo[1]);
            } else if (columnInfo[0].equals(EnterpriseUtil.PERSON)) {
                columnPerson.add(columnInfo[1]);
            }
        }
        //假设权限已经获得了
        Map<String, List<String>> columnMap = new HashMap<>();

        columnMap.put(EnterpriseUtil.BASIC, columnBasic);
        columnMap.put(EnterpriseUtil.INV, columnInv);
        columnMap.put(EnterpriseUtil.PERSON, columnPerson);

        //查询企业
        JobQuery query = BeanUtil.propertiesCopy(job, JobQuery.class);
        query.setColumns(columnMap);
        Map<String, List> entInfo = entService.queryEntList(query);
        List entList = entInfo.get(EnterpriseUtil.BASIC);
        List invList = entInfo.get(EnterpriseUtil.INV);
        List personList = entInfo.get(EnterpriseUtil.PERSON);

        if(isListEmpty(entList)) {
            return;
        }

        //生成订单
//        OrderVO orderVO = new OrderVO();
//        orderVO.setUserId(job.getUserId());
//        orderVO.setKeyType(OrderKeyType.NEW_ENTERPRISE);
//        orderVO.setOrderType(OrderType.BATCH_ORDER);
//        orderVO.setDescInfo("定时任务,新企业查询");
//        orderVO.setState(OrderState.COMPLETE);
//        orderVO.setProductInstanceId();
//        orderVO.setOrderFrom(OrderFrom.SPECIAL_LINE);


        //把查询结果填入到xml中
        Document document = new DOMDocument();
        Element root = new DOMElement("DATA");

        Date date = new Date();//查询结果完成时间
        String formatDate = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(date);
        int invIndex = 0; //投资信息的指示数
        int personIndex = 0; //人员的指示数

        for (int i = 0; i < entList.size(); i++) {
            //生成企业节点
            Element itemEle = new DOMElement("ITEM");
            Element uid = new DOMElement("UID");
            uid.setText(job.getId());

            itemEle.add(uid);
            Element orderNo = new DOMElement("ORDERNO");
            orderNo.setText("orderno"); //TODO 设置订单号
            itemEle.add(orderNo);

            Element key = new DOMElement("KEY");
            key.setText("key"); //TODO 设置企业名称
            itemEle.add(key);

            Element keyType = new DOMElement("KEYTYPE");
            keyType.setText("3");
            itemEle.add(keyType);

            Element status = new DOMElement("STATUS");
            status.setText("1");
            itemEle.add(status);

            Element finishTime = new DOMElement("FINISHTIME");
            String formatTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
            finishTime.setText(formatTime);
            itemEle.add(finishTime);

            Element orderListEle = new DOMElement("ORDERLIST");
            orderListEle.add(itemEle);


            Element entEle = new DOMElement("ITEM");//外层的item
            entEle.add(orderListEle);//将orderlist节点加入到Item中

            //生成企业基本信息节点
            if (isListEmpty(columnBasic) || isListEmpty(entList)) {
                return;
            }
            Element basicEle = new DOMElement("BASIC");
            Element basicItemEle = new DOMElement("ITEM");
            Object[] ent = (Object[]) entList.get(i);
            for (int j = 1; j < ent.length; j++) {  //在底层查询时,都加上一个字段pripid,所以第2个开始才是权限字段
                String columnName = columnBasic.get(j - 1).toUpperCase();
                Element columnEle = new DOMElement(columnName);//列名称作为节点名称
                Object columnValue = ent[j];
                Class clazz = columnValue.getClass();
                if (clazz == Timestamp.class || columnValue == Date.class) {
                    columnValue = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(columnValue);
                }
                columnEle.setText(String.valueOf(columnValue));//查询的列对应的结果作为节点的值
                basicItemEle.add(columnEle);//将该列加入到基本信息Item节点之间
            }
            basicEle.add(basicItemEle);//将item加入到基本信息中
            entEle.add(basicEle);  //将基本信息加入到企业的item

            String entPripid = (String) ent[0]; //投资信息和主要管理人员使用


            //生成企业投资信息
            if (!isListEmpty(columnInv) && !isListEmpty(invList)) {
                Element shareholderEle = new DOMElement("SHAREHOLDER");//生成投资节点

                int mInv = invIndex;
                for (int m = mInv; m < invList.size(); m++) { //从上一次投资的结束位置加1开始
                    Object[] inv = (Object[]) invList.get(m);
                    String invPripid = (String) inv[0];
                    if (!invPripid.equals(entPripid)) {
                        break;
                    }

                    Element shareholderItemEle = new DOMElement("ITEM");
                    for (int j = 1; j < inv.length; j++) {
                        String columnName = columnInv.get(j - 1).toUpperCase();
                        Element columnEle = new DOMElement(columnName);
                        Object columnValue = inv[j];
                        Class clazz = columnValue.getClass();
                        if (clazz == Timestamp.class || columnValue == Date.class) {
                            columnValue = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(columnValue);
                        }
                        columnEle.setText(String.valueOf(columnValue));//查询的列对应的结果作为节点的值
                        shareholderItemEle.add(columnEle);
                    }
                    shareholderEle.add(shareholderItemEle);
                    invIndex++;
                }
                entEle.add(shareholderEle); //将股东加入到企业的item
            }
            document.setRootElement(root);

            //生成主要管理人员信息
            if (!isListEmpty(columnPerson) && !isListEmpty(personList)) {
                Element personEle = new DOMElement("PERSON");

                int nPerson = personIndex;
                for (int n = nPerson; n < personList.size(); n++) {
                    Object[] person = (Object[]) personList.get(n);
                    String personPripid = (String) person[0];
                    if (!personPripid.equals(entPripid)) {
                        break;
                    }

                    Element personItemEle = new DOMElement("ITEM");
                    for (int j = 1; j < person.length; j++) {
                        String columnName = columnPerson.get(j - 1).toUpperCase();
                        Element columnEle = new DOMElement(columnName);
                        Object columnValue = person[j];
                        Class clazz = columnValue.getClass();
                        if (clazz == Timestamp.class || columnValue == Date.class) {
                            columnValue = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(columnValue);
                        }
                        columnEle.setText(String.valueOf(columnValue));//查询的列对应的结果作为节点的值
                        personItemEle.add(columnEle);
                    }
                    personEle.add(personItemEle);
                    personIndex++;
                }
                entEle.add(personEle); //将管理人员加入到企业的item
            }
            root.add(entEle);
        }
        document.setRootElement(root);

        OutputFormat format = new OutputFormat().createPrettyPrint();
        String filePath = JobProperties.getJobFilePath() + "/" + job.getId();
        File xmlFile = new File(filePath);
        if (!xmlFile.exists()) {
            xmlFile.mkdir();
        }
        String xmlFileName = filePath + "/" + query.getUserId() + "_" + formatDate + ".xml";
        try {
            XMLWriter writer = new XMLWriter(new FileOutputStream(xmlFileName), format);
            writer.write(document);
            writer.close();
        } catch (Exception e) {
            LOG.info("xml文件写入错误,可能是文件路径不正确." + e.getMessage());
        }


        //将任务生成的文件信息存入数据库
        JobFile jobFile = new JobFile();
        jobFile.setCreateDate(date);
        jobFile.setCustomerId(job.getCustomerId());
        jobFile.setUserId(job.getUserId());
        jobFile.setEntCount(entList.size());
        String fileName = query.getUserId() + "_" + formatDate + ".xml";
        jobFile.setFileName(fileName);
        jobFile.setJobId(job.getId());
        service.addJobFile(jobFile);

        if (job != null && job.getType() == JobTypeEnum.ONCE && job.getStatus() == JobStatusEnum.WAIT) {
            service.completeJob(job.getId());
        }


    }

    public boolean isListEmpty(List<?> list) {
        return list == null || list.size() == 0;
    }
}
