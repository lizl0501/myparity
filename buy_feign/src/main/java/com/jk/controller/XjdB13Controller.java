package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.pojo.CustomBean;
import com.jk.pojo.XzlmCustomBean;
import com.jk.pojo.inquiryDXP;
import com.jk.service.XjdB13Service;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class XjdB13Controller {

    @Autowired
    private XjdB13Service xjdB13Service;

    //注入rabbitMq工具类
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private RedisTemplate redisCacheTemplate;
    /**
     *  新增B-1-3询价单
     */
    @RequestMapping("/insertinquiry")
    @ResponseBody
    public String insertinquiry(inquiryDXP inq){
        CustomBean customBean = (CustomBean) redisCacheTemplate.opsForValue().get("custom");
        XzlmCustomBean xzlm = (XzlmCustomBean) redisCacheTemplate.opsForValue().get("asd");
        inq.setId(customBean.getId());
        inq.setName(customBean.getName());
        inq.setCount(customBean.getCount());
        inq.setType(customBean.getType());
        inq.setMinentrance(customBean.getMinentrance());
        inq.setMinenunit(customBean.getMinenunit());
        inq.setMaxentrance(customBean.getMaxentrance());
        inq.setMaxenunit(customBean.getMaxenunit());
        inq.setMinexport(customBean.getMinexport());
        inq.setMinexunit(customBean.getMinexunit());
        inq.setMaxexport(customBean.getMaxexport());
        inq.setMaxexunit(customBean.getMaxexunit());
        inq.setFlow(customBean.getFlow());
        inq.setBooster(customBean.getBooster());
        inq.setBrand(customBean.getBrand());
        inq.setCarton(customBean.getCarton());
        inq.setMaterial(customBean.getMaterial());
        inq.setRemarks(customBean.getRemarks());
        inq.setAccessory(customBean.getAccessory());
        inq.setDemand(customBean.getDemand());
        inq.setTrench(xzlm.getTrench());
        inq.setBigType(xzlm.getBigType());
        inq.setMiddleType(xzlm.getMiddleType());
        inq.setSmallType(xzlm.getSmallType());
        amqpTemplate.convertAndSend("myqueue",JSON.toJSONString(inq));
        return "123";
    }

    /**
     * 回显询价单
     * @param qid
     * @return
     */
    @RequestMapping("queryInquiryById")
    @ResponseBody
    public inquiryDXP queryInquiryById(String qid) {
        inquiryDXP inquiryDXP=xjdB13Service.queryInquiryById(qid);
        return inquiryDXP;
    }

    /**
     *  修改B-1-3询价单
     */
    @RequestMapping("/updateinquiry")
    @ResponseBody
    public void updateinquiry(inquiryDXP inq){
        amqpTemplate.convertAndSend("myqueue",JSON.toJSONString(inq));
    }

    /*@RequestMapping("/saveinquiry")
    @ResponseBody
    public String setString(inquiryDXP iii){
        iii.setQid(UUID.randomUUID().toString());
        redisCacheTemplate.opsForValue().set("str",iii);
        inquiryDXP map2 = (inquiryDXP) redisCacheTemplate.opsForValue().get("str");
        return "done";
    }*/

}
