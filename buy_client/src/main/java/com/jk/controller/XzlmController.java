package com.jk.controller;

import com.jk.pojo.XzlmTrenchBean;
import com.jk.pojo.XzlmTypeBean;
import com.jk.service.XzlmService;
import com.jk.serviceapi.XzlmServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * B-1 发布需求 选择类目
 */
@RestController
public class XzlmController implements XzlmServiceApi {

    @Autowired
    private XzlmService xzlmService;

    @Override
    public List<XzlmTrenchBean> queryXzlmTrenchBean(){

        return xzlmService.queryXzlmTrenchBean();
    }

    @Override
    public List<XzlmTypeBean> queryXzlmTypeBean(String pid){

        return xzlmService.queryXzlmTypeBean(pid);
    }


}
