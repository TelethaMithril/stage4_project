package com.sy.model;

import java.util.Date;

public class Function {
    private Integer id;
    private String funcCode;
    private String funcName;
    private String funcUrl;
    private Integer parentId;
    private Date creationTime;

    public Function(Integer id, String funcCode, String funcName, String funcUrl, Integer parentId, Date creationTime) {
        this.id = id;
        this.funcCode = funcCode;
        this.funcName = funcName;
        this.funcUrl = funcUrl;
        this.parentId = parentId;
        this.creationTime = creationTime;
    }

    public Function() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public String getFuncUrl() {
        return funcUrl;
    }

    public void setFuncUrl(String funcUrl) {
        this.funcUrl = funcUrl;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        return "Function{" +
                "id=" + id +
                ", funcCode='" + funcCode + '\'' +
                ", funcName='" + funcName + '\'' +
                ", funcUrl='" + funcUrl + '\'' +
                ", parentId=" + parentId +
                ", creationTime=" + creationTime +
                '}';
    }
}
