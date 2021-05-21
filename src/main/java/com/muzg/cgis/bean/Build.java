package com.muzg.cgis.bean;

import io.swagger.annotations.ApiModelProperty;

public class Build {
    @ApiModelProperty("ID")
    private int id;
    @ApiModelProperty("建筑名称")
    private String buildName;
    @ApiModelProperty("描述")
    private String descript;
    @ApiModelProperty("建筑编号")
    private String buildId;
    @ApiModelProperty("类型编号")
    private String typeId;
    @ApiModelProperty("经度")
    private double lng;
    @ApiModelProperty("纬度")
    private double lat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Build{" +
                "id=" + id +
                ", buildName='" + buildName + '\'' +
                ", descript='" + descript + '\'' +
                ", buildId='" + buildId + '\'' +
                ", typeId='" + typeId + '\'' +
                ", lng=" + lng +
                ", lat=" + lat +
                '}';
    }
}
