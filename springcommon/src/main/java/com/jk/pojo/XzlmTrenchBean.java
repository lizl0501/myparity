package com.jk.pojo;

import java.io.Serializable;

/**
 *  B-1 发布需求 选择类目  渠道实体
 */

public class XzlmTrenchBean implements Serializable {

    private String id;      //渠道id
    private String name;    //渠道名字

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
