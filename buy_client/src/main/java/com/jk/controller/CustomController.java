package com.jk.controller;

import com.jk.pojo.CaiLiaoDb;
import com.jk.service.CustomService;
import com.jk.serviceapi.CustomServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class CustomController implements CustomServiceApi {

    @Autowired
    private CustomService customService;

    @Override
    public HashMap<String, Object> queryCaiLiaoDb(@RequestBody CaiLiaoDb caiLiaoDb, Integer page, Integer rows) {

        return customService.queryCaiLiaoDb(caiLiaoDb,page,rows);
    }
}
