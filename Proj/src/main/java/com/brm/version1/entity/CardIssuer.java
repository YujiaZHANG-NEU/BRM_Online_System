package com.brm.version1.entity;

import java.io.Serializable;

/**
 * (CardIssuer)实体类
 *
 * @author makejava
 * @since 2021-11-30 13:28:16
 */
public class CardIssuer implements Serializable {
    private static final long serialVersionUID = 267884269221666609L;
    
    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

