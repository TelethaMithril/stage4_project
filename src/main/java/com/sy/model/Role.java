package com.sy.model;

import java.util.Date;

public class Role {
    private Integer id;
    private String roleCode;
    private String roleName;
    private Date createDate;
    private Integer isStart;
    private String createBy;

    public Role(Integer id, String roleCode, String roleName, Date createDate, Integer isStart, String createBy) {
        this.id = id;
        this.roleCode = roleCode;
        this.roleName = roleName;
        this.createDate = createDate;
        this.isStart = isStart;
        this.createBy = createBy;
    }

    public Role() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getIsStart() {
        return isStart;
    }

    public void setIsStart(Integer isStart) {
        this.isStart = isStart;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleCode='" + roleCode + '\'' +
                ", roleName='" + roleName + '\'' +
                ", createDate=" + createDate +
                ", isStart=" + isStart +
                ", createBy='" + createBy + '\'' +
                '}';
    }
}
