package com.jk.service;

import com.jk.mapper.CustomMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomServiceImpl implements CustomService{

    @Autowired
    private CustomMapper customMapper;

}
