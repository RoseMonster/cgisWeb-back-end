package com.muzg.cgis.bean;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Error {
    @ApiModelProperty("ID")
    private int id;
    @ApiModelProperty("错误描述")
    private String errorDescript;
    @ApiModelProperty("建筑编号")
    private String buildId;
    @ApiModelProperty("创建时间")
    private String createDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getErrorDescript() {
        return errorDescript;
    }

    public void setErrorDescript(String errorDescript) {
        this.errorDescript = errorDescript;
    }

    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Error{" +
                "id=" + id +
                ", errorDescript='" + errorDescript + '\'' +
                ", buildId='" + buildId + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
