package com.brm.version1.entity;

import java.io.Serializable;

/**
 * (OfficialCustomer)实体类
 *
 * @author makejava
 * @since 2021-11-30 13:29:40
 */
public class OfficialCustomer implements Serializable {
    private static final long serialVersionUID = -46887300916112140L;
    
    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

