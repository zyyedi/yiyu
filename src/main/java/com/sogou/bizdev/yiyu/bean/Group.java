package com.sogou.bizdev.yiyu.bean;

import java.util.List;
import java.io.Serializable;

public class Group implements Serializable {

    private static final long serialVersionUID = 7626431522271049270L;

    private Integer groupId;
    private String groupName;
    private Integer planId;
    private String planName;
    private Integer budget;

    private List<GroupChannel> channels;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public List<GroupChannel> getChannels() {
        return channels;
    }

    public void setChannels(List<GroupChannel> channels) {
        this.channels = channels;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
