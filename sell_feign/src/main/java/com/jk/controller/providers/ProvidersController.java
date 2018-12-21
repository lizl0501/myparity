package com.jk.controller.providers;

import com.jk.pojo.providers.Tt;
import com.jk.service.providers.ProvidersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class ProvidersController {

    @Autowired
    private ProvidersService providersService;

    @GetMapping("querySelect")
    @ResponseBody
    public List<Tt>querySelect(){
        return providersService.querySelect();
    }
     //卖家工作台 D-1定制比价管理（供应商）
    //D-1-1项目详情页（同此）
    @PostMapping("SelectTt")
    @ResponseBody
    public HashMap<String,Object>SelectTt(Integer page, Integer rows,Tt tt){
        return providersService.SelectTt(page,rows,tt);
    }
}
