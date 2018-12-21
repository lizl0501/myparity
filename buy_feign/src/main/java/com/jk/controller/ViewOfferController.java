package com.jk.controller;

import com.jk.service.ViewOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * B-2-3查看报价
 */
@Controller
public class ViewOfferController {

    @Autowired
    private ViewOfferService viewOfferService;

}
