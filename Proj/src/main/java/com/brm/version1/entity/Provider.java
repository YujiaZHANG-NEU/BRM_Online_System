package com.brm.version1.entity;

import java.io.Serializable;

/**
 * (Provider)实体类
 *
 * @author makejava
 * @since 2021-11-30 13:30:33
 */
public class Provider implements Serializable {
    private static final long serialVersionUID = -56499356156590442L;
    
    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

