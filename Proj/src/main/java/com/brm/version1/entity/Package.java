package com.brm.version1.entity;

import java.io.Serializable;

/**
 * (Package)实体类
 *
 * @author makejava
 * @since 2021-11-30 14:38:42
 */
public class Package implements Serializable {
    private static final long serialVersionUID = 167349441849745674L;

    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

