package com.jk.mapper;

import com.jk.pojo.inquiryDXP;
import org.apache.ibatis.annotations.Param;

public interface InquiryDXPMapper {

    /**
     *  新增B-1-3询价单
     */
    void savainquiry(@Param("inq") inquiryDXP inq);

    /**
     * 回显询价单
     * @param qid
     * @return
     */
    inquiryDXP queryInquiryById(@Param("qid") String qid);

    /**
     *  修改B-1-3询价单
     */
    void updateinquiry(@Param("inq") inquiryDXP inq);
}
