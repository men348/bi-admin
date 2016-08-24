package com.chinadaas.platform.bi.server.entrepository.impl;

import com.chinadaas.platform.bi.model.domain.JobQuery;
import com.chinadaas.platform.bi.model.util.EnterpriseUtil;
import com.chinadaas.platform.bi.server.ententity.ProvinceCode;
import com.chinadaas.platform.bi.server.entrepository.CommonRepository;
import com.chinadaas.platform.bi.server.entrepository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xie on 16/8/5.
 */
@Repository
public class EnterpriseRepositoryImpl implements EnterpriseRepository {

    @Autowired
    private CommonRepository repository;

    @Override
    public Map<String, List> queryEntList(JobQuery query) {
        if (query == null)
            return null;

        //条件
        StringBuilder conditionJpql = new StringBuilder();
        Map<String, Object> params = new HashMap<>();

        String entCapital = query.getEntCapital();
        if (!StringUtils.isEmpty(entCapital) && entCapital.contains(",")) {
            String[] entCaps = entCapital.split(",");
            Integer capMin = Integer.valueOf(entCaps[0]);
            Integer capMax = Integer.valueOf(entCaps[1]);
            if (capMax > 0) {
                conditionJpql.append(" and e.regcap > :capMin");
                params.put("capMin", capMin);
            }
            if (capMax > 0 && capMax > capMin) {
                conditionJpql.append(" and e.regcap < :capMax");
                params.put("capMax", capMax);
            }
        }

        Date startDate = query.getEntCreateStartDate();
        if (startDate != null) {
            conditionJpql.append(" and e.esdate > :startDate");
            params.put("startDate", startDate);
        }

        Date endDate = query.getEntCreateEndDate();
        if (endDate != null) {
            conditionJpql.append(" and e.esdate < :endDate");
            params.put("endDate", endDate);
        }

        String province = query.getEntProvince();
        if (!StringUtils.isEmpty(province)) {
            String provinceJpql = "select p from ProvinceCode p where p.name = :name";
            Map<String, Object> provinceParams = new HashMap<>();
            provinceParams.put("name", province);
            List<ProvinceCode> provinceCodeList = repository.queryResult(ProvinceCode.class, provinceJpql, provinceParams);

            if (!CollectionUtils.isEmpty(provinceCodeList)) {
                String code = provinceCodeList.get(0).getCode();
                conditionJpql.append(" and e.s_ext_nodenum = :code");
                params.put("code", code);
            }
        }

        //字段
        Map<String, List<String>> columnMap = query.getColumns();

        //企业基本信息的字段
        StringBuilder basicjpql = new StringBuilder();
        List<String> basicColumns = columnMap.get(EnterpriseUtil.BASIC);
        List basicInfo = null;
        if (basicColumns != null && basicColumns.size() > 0) {
            basicjpql.append("select e.pripid id" );
            for (int i = 0; i < basicColumns.size(); i++) {
                basicjpql.append(", e." + basicColumns.get(i));
            }
            basicjpql.append(" from enterprisebaseinfocollect e where 1=1");
            basicjpql.append(conditionJpql);
            basicInfo = repository.queryList(basicjpql.toString(), params);
        }

        //企业投资信息的字段
        StringBuilder invJpql = new StringBuilder();
        List<String> invColumns = columnMap.get(EnterpriseUtil.INV);
        List invList = null;
        if (invColumns != null && invColumns.size() > 0) {
            invJpql.append("select i.pripid id" );
            for (int i = 0; i < invColumns.size(); i++) {
                invJpql.append(", i." + invColumns.get(i));
            }
            invJpql.append(" from e_inv_investment i inner join enterprisebaseinfocollect e on i.pripid=e.pripid and i.s_ext_nodenum=e.s_ext_nodenum where 1=1");
            invJpql.append(conditionJpql);
            invList = repository.queryList(invJpql.toString(), params);
        }

        //企业主要管理人员信息
        StringBuilder personJpql = new StringBuilder();
        List<String> personColumns = columnMap.get(EnterpriseUtil.PERSON);
        List personList = null;
        if (personColumns != null && personColumns.size() > 0) {
            personJpql.append("select p.pripid id");
            for (int i = 0; i < personColumns.size(); i++) {
                personJpql.append(", p." + personColumns.get(i));
            }
            personJpql.append(" from e_pri_person p inner join enterprisebaseinfocollect e on p.pripid=e.pripid and p.s_ext_nodenum=e.s_ext_nodenum where 1=1");
            personJpql.append(conditionJpql);
            personList = repository.queryList(personJpql.toString(), params);
        }

        Map<String, List> result = new HashMap<>();
        if (basicInfo != null && basicInfo.size() > 0) {
            result.put(EnterpriseUtil.BASIC, basicInfo);
        }
        if (invList != null && invList.size() > 0) {
            result.put(EnterpriseUtil.INV, invList);
        }
        if(personList != null && personList.size() > 0) {
            result.put(EnterpriseUtil.PERSON, personList);
        }

        return result;
    }


}
