package com.sy.model;


import java.util.Date;

//留言回复表
public class Leave_reply {

    private Integer id;
    private Integer messageId;
    private String replyContent;
    private String createdBy;
    private Date createTime;

    @Override
    public String toString() {
        return "Leave_reply{" +
                "id=" + id +
                ", messageId=" + messageId +
                ", replyContent='" + replyContent + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}
