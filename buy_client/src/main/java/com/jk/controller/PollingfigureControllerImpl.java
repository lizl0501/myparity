package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.pojo.PollingFigureBean;
import com.jk.service.PollingfigureB1Service;
import com.jk.serviceapi.PollingFigureB1ServiceApi;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PollingfigureControllerImpl implements PollingFigureB1ServiceApi {

    @Autowired
    private PollingfigureB1Service pollingFigureServices;

    @Override
    public List<PollingFigureBean> selectPollingFigure() {
        return pollingFigureServices.selectPollingFigure();
    }

    /**
     * B-1-1
     * 确认发布询图单
     * @param pollingFigureBean
     */
    @RabbitListener(queues = "savePollingFigureMQ")
    public void savePollingFigure(String pollingFigureBean){
       PollingFigureBean PollingFigureBean = JSON.parseObject(pollingFigureBean, PollingFigureBean.class);
       pollingFigureServices.savePollingFigure(PollingFigureBean);
    }
}
