package com.jk.serviceapi;

import com.jk.pojo.inquiryDXP;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("CldB14ServiceApi")
public interface CldB14ServiceApi {
    @PostMapping("queryInquiry")
    inquiryDXP queryInquiry(@RequestParam("id")String id);
}
