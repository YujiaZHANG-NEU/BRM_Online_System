package com.brm.version1.entity;

import java.io.Serializable;

/**
 * (Service)实体类
 *
 * @author makejava
 * @since 2021-11-30 13:30:45
 */
public class Service implements Serializable {
    private static final long serialVersionUID = 964333219094502012L;
    
    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

