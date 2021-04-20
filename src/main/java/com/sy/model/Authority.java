package com.sy.model;

import java.util.Date;

public class Authority {
    private Integer id;
    private Integer roleId;
    private Integer functionId;
    private Date creationTime;
    private String createBy;

    public Authority(Integer id, Integer roleId, Integer functionId, Date creationTime, String createBy) {
        this.id = id;
        this.roleId = roleId;
        this.functionId = functionId;
        this.creationTime = creationTime;
        this.createBy = createBy;
    }

    public Authority() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", functionId=" + functionId +
                ", creationTime=" + creationTime +
                ", createBy='" + createBy + '\'' +
                '}';
    }
}
