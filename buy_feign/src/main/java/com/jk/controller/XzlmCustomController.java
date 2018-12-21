package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.pojo.XzlmCustomBean;
import com.jk.pojo.XzlmTrenchBean;
import com.jk.pojo.XzlmTypeBean;
import com.jk.service.CustomService;
import com.jk.service.XzlmCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * B-1 发布需求 选择类目
 */
@Controller
public class XzlmCustomController {

    @Autowired
    private XzlmCustomService xzlmCustomService;

    @Autowired
    private RedisTemplate redisCacheTemplate;

    /**
     * B-1 发布需求 选择类目  新增类目信息
     * @return 1：新增成功
     */
    @RequestMapping("addXzlmCustom")
    @ResponseBody
    public String addXzlmCustom(XzlmCustomBean xzlmCustomBean){
        xzlmCustomBean.setId(UUID.randomUUID().toString());
        redisCacheTemplate.opsForValue().set("asd",xzlmCustomBean);
        return "1";
    }

    /**
     * B-1 发布需求 选择类目  查询渠道信息
     * @return
     */
    @RequestMapping("queryXzlmTrenchBean")
    @ResponseBody
    public List<XzlmTrenchBean> queryXzlmTrenchBean(){
        return xzlmCustomService.queryXzlmTrenchBean();
    }

    /**
     * B-1 发布需求 选择类目  查询类型信息
     * @return
     */
    @RequestMapping("queryXzlmTypeBean")
    @ResponseBody
    public List<XzlmTypeBean> queryXzlmTypeBean(String pid){
        return xzlmCustomService.queryXzlmTypeBean(pid);
    }

}
