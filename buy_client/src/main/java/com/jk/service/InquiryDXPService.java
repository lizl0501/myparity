package com.jk.service;

import com.jk.pojo.inquiryDXP;

public interface InquiryDXPService {
    /**
     *  新增B-1-3询价单
     */
    void savainquiry(inquiryDXP inq);

    /**
     * 回显询价单
     * @param qid
     * @return
     */
    inquiryDXP queryInquiryById(String qid);

    /**
     *  修改B-1-3询价单
     */
    //void updateinquiry(inquiryDXP inq);
}
