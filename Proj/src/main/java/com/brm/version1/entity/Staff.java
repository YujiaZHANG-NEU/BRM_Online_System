package com.brm.version1.entity;

import java.io.Serializable;

/**
 * (Staff)实体类
 *
 * @author makejava
 * @since 2021-11-30 13:30:58
 */
public class Staff implements Serializable {
    private static final long serialVersionUID = 977508743367744877L;
    
    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

