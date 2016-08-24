package com.chinadaas.platform.bi.server.ententity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by xie on 16/8/17.
 */
@Entity
@Table(name = "D_QYGS")
public class ProvinceCode {

    private String code;
    private String name;

    @Id
    @Column
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
