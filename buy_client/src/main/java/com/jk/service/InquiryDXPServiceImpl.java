package com.jk.service;

import com.jk.mapper.InquiryDXPMapper;
import com.jk.pojo.inquiryDXP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class InquiryDXPServiceImpl implements InquiryDXPService{

    @Autowired
    private InquiryDXPMapper inquiryDXPMapper;
    /**
     *  新增B-1-3询价单
     */
    @Override
    public void savainquiry(inquiryDXP inq) {
        inq.setQid(UUID.randomUUID().toString());
        inquiryDXPMapper.savainquiry(inq);
    }

    /**
     * 回显询价单
     * @param qid
     * @return
     */
    @Override
    public inquiryDXP queryInquiryById(String qid) {
        return inquiryDXPMapper.queryInquiryById(qid);
    }

    /**
     *  修改B-1-3询价单
     */
    @Override
    public void updateinquiry(inquiryDXP inq) {
        inquiryDXPMapper.updateinquiry(inq);
    }
}
