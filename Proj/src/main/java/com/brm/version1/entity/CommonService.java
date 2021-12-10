package com.brm.version1.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (CommonService)实体类
 *
 * @author makejava
 * @since 2021-12-02 17:53:53
 */
public class CommonService implements Serializable {
    private static final long serialVersionUID = 802641090670764223L;

    private Integer id;

    private Date ctreateTime;

    private String customerName;

    private Date dueTime;

    private String type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCtreateTime() {
        return ctreateTime;
    }

    public void setCtreateTime(Date ctreateTime) {
        this.ctreateTime = ctreateTime;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getDueTime() {
        return dueTime;
    }

    public void setDueTime(Date dueTime) {
        this.dueTime = dueTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

