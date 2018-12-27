package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.pojo.CaiLiaoDb;
import com.jk.pojo.inquiryDXP;
import com.jk.service.CldB14Service;
import com.jk.serviceapi.CldB14ServiceApi;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CldB14Controller implements CldB14ServiceApi {
    @Autowired
    private CldB14Service cldB14Service;
    @RabbitListener(queues = "addcailiao")
    public void addCld(String message){
        CaiLiaoDb caiLiaoDb = JSON.parseObject(message, CaiLiaoDb.class);
        cldB14Service.addCld(caiLiaoDb);
    }

    @Override
    public inquiryDXP queryInquiry(@RequestParam("id") String id) {
        return cldB14Service.queryInquiry(id);
    }
}
