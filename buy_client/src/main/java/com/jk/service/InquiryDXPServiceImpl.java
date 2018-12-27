package com.jk.service;

import com.jk.mapper.InquiryDXPMapper;
import com.jk.pojo.inquiryDXP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
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
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String dates=df.format(new Date());
        if (inq.getStratDate().equals("1")){
            inq.setStratDate(dates);
        }
        if (inq.getGongbuDate().equals("1")){
            inq.setGongbuDate(dates);
        }
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
   /* @Override
    public void updateinquiry(inquiryDXP inq) {
        inquiryDXPMapper.updateinquiry(inq);
    }*/
}
