package com.jk.controller;

import com.jk.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomController {

    @Autowired
    private CustomService customService;



}
