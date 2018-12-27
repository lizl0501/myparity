package com.jk.controller;


import com.alibaba.fastjson.JSON;
import com.jk.pojo.CustomBean;
import com.jk.pojo.PollingFigureBean;
import com.jk.pojo.XzlmCustomBean;
import com.jk.service.PollingFigureB1Service;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class PollingFigureB1Controller {

    @Autowired
    private PollingFigureB1Service pollingFigureService;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private RedisTemplate redisCacheTemplate;


    /**B-1-1
     * 确认发布询图单
     * @param pollingFigureBean
     * @return
     */
    @PostMapping("savePollingFigure")
    @ResponseBody
    public String savePollingFigure(PollingFigureBean pollingFigureBean){
        //给主键附UUID
        pollingFigureBean.setPollingfigureid(UUID.randomUUID().toString());
        //从Redis里面获取到值 用对应的实体类接收
        XzlmCustomBean XzlmCustomredis = (XzlmCustomBean) redisCacheTemplate.opsForValue().get("asd");
        CustomBean CustomBeanredis = (CustomBean) redisCacheTemplate.opsForValue().get("custom");
        //将获取到的值set进主实体类
        pollingFigureBean.setName(CustomBeanredis.getName());
        pollingFigureBean.setCount(CustomBeanredis.getCount());
        pollingFigureBean.setType(CustomBeanredis.getType());
        pollingFigureBean.setMinentrance(CustomBeanredis.getMinentrance());
        pollingFigureBean.setMinenunit(CustomBeanredis.getMinenunit());
        pollingFigureBean.setMaxentrance(CustomBeanredis.getMaxentrance());
        pollingFigureBean.setMaxenunit(CustomBeanredis.getMaxenunit());
        pollingFigureBean.setMinexport(CustomBeanredis.getMinexport());
        pollingFigureBean.setMinexunit(CustomBeanredis.getMinexunit());
        pollingFigureBean.setMaxexport(CustomBeanredis.getMaxexport());
        pollingFigureBean.setMaxexunit(CustomBeanredis.getMaxexunit());
        pollingFigureBean.setFlow(CustomBeanredis.getFlow());
        pollingFigureBean.setBooster(CustomBeanredis.getBooster());
        pollingFigureBean.setBrand(CustomBeanredis.getBrand());
        pollingFigureBean.setCarton(CustomBeanredis.getCarton());
        pollingFigureBean.setMaterial(CustomBeanredis.getMaterial());
        pollingFigureBean.setRemarks(CustomBeanredis.getRemarks());
        pollingFigureBean.setAccessory(CustomBeanredis.getAccessory());
        pollingFigureBean.setDemand(CustomBeanredis.getDemand());
        pollingFigureBean.setTrench(XzlmCustomredis.getTrench());
        pollingFigureBean.setBigType(XzlmCustomredis.getBigType());
        pollingFigureBean.setMiddleType(XzlmCustomredis.getMiddleType());
        pollingFigureBean.setSmallType(XzlmCustomredis.getSmallType());
        //存到rabbitmq里面转成string格式存进去
        amqpTemplate.convertAndSend("savePollingFigureMQ", JSON.toJSONString(pollingFigureBean));
        return "1";
    }
    @PostMapping("savePollingFigureredis")
    @ResponseBody
    public String savePollingFigureredis(PollingFigureBean pollingFigureBean){
        //给主键附UUID
        pollingFigureBean.setPollingfigureid(UUID.randomUUID().toString());
        //从Redis里面获取到值 用对应的实体类接收
        XzlmCustomBean XzlmCustomredis = (XzlmCustomBean) redisCacheTemplate.opsForValue().get("asd");
        CustomBean CustomBeanredis = (CustomBean) redisCacheTemplate.opsForValue().get("custom");
        //将获取到的值set进主实体类
        pollingFigureBean.setName(CustomBeanredis.getName());
        pollingFigureBean.setCount(CustomBeanredis.getCount());
        pollingFigureBean.setType(CustomBeanredis.getType());
        pollingFigureBean.setMinentrance(CustomBeanredis.getMinentrance());
        pollingFigureBean.setMinenunit(CustomBeanredis.getMinenunit());
        pollingFigureBean.setMaxentrance(CustomBeanredis.getMaxentrance());
        pollingFigureBean.setMaxenunit(CustomBeanredis.getMaxenunit());
        pollingFigureBean.setMinexport(CustomBeanredis.getMinexport());
        pollingFigureBean.setMinexunit(CustomBeanredis.getMinexunit());
        pollingFigureBean.setMaxexport(CustomBeanredis.getMaxexport());
        pollingFigureBean.setMaxexunit(CustomBeanredis.getMaxexunit());
        pollingFigureBean.setFlow(CustomBeanredis.getFlow());
        pollingFigureBean.setBooster(CustomBeanredis.getBooster());
        pollingFigureBean.setBrand(CustomBeanredis.getBrand());
        pollingFigureBean.setCarton(CustomBeanredis.getCarton());
        pollingFigureBean.setMaterial(CustomBeanredis.getMaterial());
        pollingFigureBean.setRemarks(CustomBeanredis.getRemarks());
        pollingFigureBean.setAccessory(CustomBeanredis.getAccessory());
        pollingFigureBean.setDemand(CustomBeanredis.getDemand());
        pollingFigureBean.setTrench(XzlmCustomredis.getTrench());
        pollingFigureBean.setBigType(XzlmCustomredis.getBigType());
        pollingFigureBean.setMiddleType(XzlmCustomredis.getMiddleType());
        pollingFigureBean.setSmallType(XzlmCustomredis.getSmallType());
        //存到redis里面
        redisCacheTemplate.opsForValue().set("pollingFigureBean",pollingFigureBean);
        return "1";
    }

    /**B3-1
     * 询图单查询
     * @return
     */
    @GetMapping("selectPollingFigure")
    @ResponseBody
    public List<PollingFigureBean> selectPollingFigure(){
        return pollingFigureService.selectPollingFigure();
    }

    /**B3-1 有一个寻图单修改点击调用此方法
     * 寻图单回显
     * @param pollingfigureid
     * @return
     */
    @GetMapping("PollingFigureHx")
    @ResponseBody
    public PollingFigureBean PollingFigureHx(String pollingfigureid){
        return pollingFigureService.PollingFigureHx(pollingfigureid);
    }


    @RequestMapping("PollingFigureUpdate")
    @ResponseBody
    public String PollingFigureUpdate(PollingFigureBean pollingFigureBean){
        amqpTemplate.convertAndSend("savePollingFigureMQ", JSON.toJSONString(pollingFigureBean));
        return "1";
    }
}
