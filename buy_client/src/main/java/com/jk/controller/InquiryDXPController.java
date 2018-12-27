package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.pojo.inquiryDXP;
import com.jk.service.InquiryDXPService;
import com.jk.serviceapi.XjdB221Api;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InquiryDXPController implements XjdB221Api {

    @Autowired
    private InquiryDXPService inquiryDXPService;

    /**
     *  新增B-1-3询价单
     */
    @RabbitListener(queues = "myqueue")
    public void savainquiry(String message){
        inquiryDXP inq = JSON.parseObject(message, inquiryDXP.class);
        inquiryDXPService.savainquiry(inq);
    }
    /**
     *  修改B-1-3询价单
     */
    @RabbitListener(queues = "myqueue")
    public void updateinquiry(String message){
        inquiryDXP inq = JSON.parseObject(message, inquiryDXP.class);
        inquiryDXPService.updateinquiry(inq);
    }

    /**
     * 回显询价单
     * @param qid
     * @return
     */
    @Override
    public inquiryDXP queryInquiryById(@RequestParam("qid") String qid) {
        inquiryDXP inquiryDXP=inquiryDXPService.queryInquiryById(qid);
        return inquiryDXP;
    }
}
