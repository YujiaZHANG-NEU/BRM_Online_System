package com.brm.version1.entity;

import java.io.Serializable;

/**
 * (Department)实体类
 *
 * @author makejava
 * @since 2021-11-30 13:29:27
 */
public class Department implements Serializable {
    private static final long serialVersionUID = 123364698414806269L;

    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

