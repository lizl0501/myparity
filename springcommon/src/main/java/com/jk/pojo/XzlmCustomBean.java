package com.jk.pojo;


import java.io.Serializable;

/**
 * B-1 发布需求 选择类目   类目实体
 */
public class XzlmCustomBean {


    private String id;          //id
    private String trench;      //渠道
    private String bigType;     //大类型
    private String middleType;  //中类型
    private String smallType;   //小类型

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrench() {
        return trench;
    }

    public void setTrench(String trench) {
        this.trench = trench;
    }

    public String getBigType() {
        return bigType;
    }

    public void setBigType(String bigType) {
        this.bigType = bigType;
    }

    public String getMiddleType() {
        return middleType;
    }

    public void setMiddleType(String middleType) {
        this.middleType = middleType;
    }

    public String getSmallType() {
        return smallType;
    }

    public void setSmallType(String smallType) {
        this.smallType = smallType;
    }
}
