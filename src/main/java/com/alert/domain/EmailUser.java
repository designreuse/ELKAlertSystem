package com.alert.domain;

import java.util.Date;

/**
 * Project: AlertSystem
 * Module Desc:com.juntu.alert.domain
 * User: zjprevenge
 * Date: 2016/11/4
 * Time: 13:31
 */
public class EmailUser {

    private int id;
    private String userName;
    private String email;
    private Date createTime;
    private Date updateTime;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
