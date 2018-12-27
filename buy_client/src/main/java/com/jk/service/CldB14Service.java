package com.jk.service;

import com.jk.pojo.CaiLiaoDb;
import com.jk.pojo.inquiryDXP;

public interface CldB14Service {

    void addCld(CaiLiaoDb caiLiaoDb);

    inquiryDXP queryInquiry(String id);
}