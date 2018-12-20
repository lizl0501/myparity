package com.jk.service;

import com.jk.mapper.CustomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomServiceImpl implements CustomService{

    @Autowired
    private CustomMapper customMapper;

}
