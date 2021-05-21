package com.muzg.cgis.bean;

import io.swagger.annotations.ApiModelProperty;

public class Admain {
    @ApiModelProperty("ID")
    private int id;
    @ApiModelProperty("管理员编号")
    private String admainId;
    @ApiModelProperty("管理员类型")
    private String admainType;
    @ApiModelProperty("账号")
    private String username;
    @ApiModelProperty("密码")
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdmainId() {
        return admainId;
    }

    public void setAdmainId(String admainId) {
        this.admainId = admainId;
    }

    public String getAdmainType() {
        return admainType;
    }

    public void setAdmainType(String admainType) {
        this.admainType = admainType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admain{" +
                "id=" + id +
                ", admainId='" + admainId + '\'' +
                ", admainType='" + admainType + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
