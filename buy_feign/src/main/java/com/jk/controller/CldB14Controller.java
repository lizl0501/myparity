package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.pojo.CaiLiaoDb;
import com.jk.pojo.CustomBean;
import com.jk.pojo.inquiryDXP;
import com.jk.service.CldB14Service;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CldB14Controller {
    @Autowired
    private CldB14Service cldB14Service;

    @Autowired
    private RedisTemplate redisCacheTemplate;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @RequestMapping("addCld")
    @ResponseBody
    public void addCldB14(CaiLiaoDb caiLiaoDb){
        CustomBean customBean = (CustomBean) redisCacheTemplate.opsForValue().get("custom");
        String id="6fe2c3d2-5d0a-4161-bec1-2bbec43a3115";
        inquiryDXP indp=cldB14Service.queryInquiry(id);
        System.out.println(indp);
        caiLiaoDb.setId(customBean.getId());
        caiLiaoDb.setName(indp.getName());
        caiLiaoDb.setCount(indp.getCount());
        caiLiaoDb.setType(indp.getType());
        caiLiaoDb.setMinentrance(indp.getMinentrance());
        caiLiaoDb.setMinenunit(indp.getMinenunit());
        caiLiaoDb.setMaxentrance(indp.getMaxentrance());
        caiLiaoDb.setMaxenunit(indp.getMaxenunit());
        caiLiaoDb.setMinexport(indp.getMinexport());
        caiLiaoDb.setMinexunit(indp.getMinexunit());
        caiLiaoDb.setMaxexport(indp.getMaxexport());
        caiLiaoDb.setMaxexunit(indp.getMaxexunit());
        caiLiaoDb.setFlow(indp.getFlow());
        caiLiaoDb.setBooster(indp.getBooster());
        caiLiaoDb.setBrand(indp.getBrand());
        caiLiaoDb.setCarton(indp.getCarton());
        caiLiaoDb.setMaterial(indp.getMaterial());
        caiLiaoDb.setRemarks(indp.getRemarks());
        caiLiaoDb.setAccessory(indp.getAccessory());
        caiLiaoDb.setDemand(indp.getDemand());
        caiLiaoDb.setTrench(indp.getTrench());
        caiLiaoDb.setBigType(indp.getBigType());
        caiLiaoDb.setMiddleType(indp.getMiddleType());
        caiLiaoDb.setSmallType(indp.getSmallType());
        caiLiaoDb.setQid(indp.getQid());
        caiLiaoDb.setStratDate(indp.getStratDate());
        caiLiaoDb.setEndDate(indp.getEndDate());
        caiLiaoDb.setGongbuDate(indp.getGongbuDate());
        caiLiaoDb.setQiwangday(indp.getQiwangday());
        caiLiaoDb.setGongyingshang(indp.getGongyingshang());
        caiLiaoDb.setLowcount(indp.getLowcount());
        caiLiaoDb.setZongjia(indp.getZongjia());
        caiLiaoDb.setFukaunjiedian(indp.getFukaunjiedian());
        caiLiaoDb.setFukaunbili(indp.getFukaunbili());
        caiLiaoDb.setFukaunday(indp.getFukaunday());
        caiLiaoDb.setFapiaotype(indp.getFapiaotype());
        caiLiaoDb.setKaipiao(indp.getKaipiao());
        caiLiaoDb.setJiesuanshang(indp.getJiesuanshang());
        caiLiaoDb.setPeisong(indp.getPeisong());
        caiLiaoDb.setAdress(indp.getAdress());
        caiLiaoDb.setPeizhu(indp.getPeizhu());
        caiLiaoDb.setFujian(indp.getFujian());
        caiLiaoDb.setStatus(indp.getStatus());
        amqpTemplate.convertAndSend("addcailiao", JSON.toJSONString(caiLiaoDb));
    }
}