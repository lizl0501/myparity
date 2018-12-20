package com.jk.controller;

import com.jk.service.CustomService;
import com.jk.serviceapi.CustomServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController implements CustomServiceApi {

    @Autowired
    private CustomService customService;
}
