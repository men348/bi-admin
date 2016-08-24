package com.chinadaas.platform.bi.server.adapter;


import com.chinadaas.platform.bi.model.util.EnterpriseUtil;
import com.chinadaas.platform.product.resolver.ColumnType;
import com.chinadaas.platform.product.resolver.MetaColumn;
import com.chinadaas.platform.product.resolver.MetaColumnGroup;

import java.util.List;

/**
 * Created by xie on 16/8/3.
 */
@MetaColumnGroup(name = "查询结果", code = "RESULT")
public class NewEntResult {

    private EnterpriseBasic basic;
    private List<EnterpriseInv> investments;
    private List<EnterprisePerson> persons;

    @MetaColumn(name = "企业基本信息", code = EnterpriseUtil.BASIC, type = ColumnType.OBJECT)
    public EnterpriseBasic getBasic() {
        return basic;
    }

    public void setBasic(EnterpriseBasic basic) {
        this.basic = basic;
    }

    @MetaColumn(name = "企业对外投资信息", code = EnterpriseUtil.INV, type = ColumnType.COLLECTION)
    public List<EnterpriseInv> getInvestments() {
        return investments;
    }

    public void setInvestments(List<EnterpriseInv> investments) {
        this.investments = investments;
    }

    @MetaColumn(name = "管理人员信息", code = EnterpriseUtil.PERSON, type = ColumnType.COLLECTION)
    public List<EnterprisePerson> getPersons() {
        return persons;
    }

    public void setPersons(List<EnterprisePerson> persons) {
        this.persons = persons;
    }

}
