package com.muzg.cgis.bean;

import io.swagger.annotations.ApiModelProperty;

public class Point {
    @ApiModelProperty("ID")
    private int id;
    @ApiModelProperty("经度")
    private double lng;
    @ApiModelProperty("纬度")
    private double lat;
    @ApiModelProperty("是否限行")
    private String isBan;
    @ApiModelProperty("相邻点")
    private String adj;
    @ApiModelProperty("通行类型（行人车辆）")
    private String navType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getIsBan() {
        return isBan;
    }

    public void setIsBan(String isBan) {
        this.isBan = isBan;
    }

    public String getAdj() {
        return adj;
    }

    public void setAdj(String adj) {
        this.adj = adj;
    }

    public String getNavType() {
        return navType;
    }

    public void setNavType(String navType) {
        this.navType = navType;
    }

    @Override
    public String toString() {
        return "Point{" +
                "id=" + id +
                ", lng=" + lng +
                ", lat=" + lat +
                ", isBan='" + isBan + '\'' +
                ", adj='" + adj + '\'' +
                ", navType='" + navType + '\'' +
                '}';
    }
}
