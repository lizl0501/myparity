package com.jk.controller;

import com.jk.pojo.CustomBean;
import com.jk.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.UUID;

@Controller
public class CustomController {

    @Autowired
    private CustomService customService;

    @Autowired
    private RedisTemplate redisCacheTemplate;
    /**
     * b-1-0发布定制需求-项目基本信息及关键参数
     * @param customBean
     * @return 123 新增成功
     */
    @RequestMapping("addCustom")
    @ResponseBody
    public String addCustom(CustomBean customBean){
        customBean.setId(UUID.randomUUID().toString());
        redisCacheTemplate.opsForValue().set("custom",customBean);
        return "123";
    }

}
