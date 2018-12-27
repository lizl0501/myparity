package com.jk.serviceapi;

import com.jk.pojo.inquiryDXP;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("XjdB221Api")
public interface XjdB221Api {

    /**
     * 回显询价单
     * @param qid
     * @return
     */
    @PostMapping("queryInquiryById")
    inquiryDXP queryInquiryById(@RequestParam("qid") String qid);

}
