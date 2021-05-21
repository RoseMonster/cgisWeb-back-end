package com.muzg.cgis.bean;

import io.swagger.annotations.ApiModelProperty;

public class Type {
    @ApiModelProperty("ID")
    private int id;
    @ApiModelProperty("类型名称")
    private String typeName;
    @ApiModelProperty("类型编号")
    private String typeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", typeId='" + typeId + '\'' +
                '}';
    }
}
