package com.chinadaas.platform.bi.model.domain;

import com.chinadaas.platform.bi.model.enums.JobStatusEnum;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by xie on 16/7/26.
 */
public class JobQuery extends PaginateQuery {
    private String startDate;
    private String endDate;
    private String customerId;
    private String userId;
    private String entProvince;
    private String statuses;

    //以下字段主要是在创建企业查询任务时使用
    private Date entCreateStartDate;
    private Date entCreateEndDate;
    private String entCapital;

    private Map<String, List<String>> columns;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEntProvince() {
        return entProvince;
    }

    public void setEntProvince(String entProvince) {
        this.entProvince = entProvince;
    }

    public Date getStartDateFor() {
        try {
            if (!StringUtils.isEmpty(startDate))
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(startDate + " 00:00:00");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Date getEndDateFor() {
        try {
            if (!StringUtils.isEmpty(endDate))
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(endDate + " 23:59:59");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getStatuses() {
        return statuses;
    }

    public void setStatuses(String statuses) {
        this.statuses = statuses;
    }



    public Date getEntCreateStartDate() {
        return entCreateStartDate;
    }

    public void setEntCreateStartDate(Date entCreateStartDate) {
        this.entCreateStartDate = entCreateStartDate;
    }

    public Date getEntCreateEndDate() {
        return entCreateEndDate;
    }

    public void setEntCreateEndDate(Date entCreateEndDate) {
        this.entCreateEndDate = entCreateEndDate;
    }

    public String getEntCapital() {
        return entCapital;
    }

    public void setEntCapital(String entCapital) {
        this.entCapital = entCapital;
    }



    public List<JobStatusEnum> getStatusList() {
        List<JobStatusEnum> statusList = new LinkedList<>();
        if(!StringUtils.isEmpty(statuses)) {
            String[] array = statuses.split(",");
            for (String item : array) {
                JobStatusEnum status = JobStatusEnum.valueOf(item);
                statusList.add(status);
            }
        }
        return statusList;
    }

    public Integer getMinEntCapital() {
        if(!StringUtils.isEmpty(entCapital) && entCapital.contains(",")) {
            String[] caps = entCapital.split(",");
            return Integer.valueOf(caps[0]);
        }
        return -1;
    }

    public Integer getMaxEntCapital() {
        if(!StringUtils.isEmpty(entCapital) && entCapital.contains(",")) {
            String[] caps = entCapital.split(",");
            return Integer.valueOf(caps[1]);
        }
        return -1;
    }

    public Map<String, List<String>> getColumns() {
        return columns;
    }

    public void setColumns(@RequestBody Map<String, List<String>> columns) {
        this.columns = columns;
    }
}
