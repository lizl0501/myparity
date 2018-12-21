package com.jk.pojo;

/**
 * B-1 发布需求 选择类目  类型实体
 */
public class XzlmTypeBean {
    private String id;     //类型id
    private String name;   //类型名称
    private String pid;    //父级id

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

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}
