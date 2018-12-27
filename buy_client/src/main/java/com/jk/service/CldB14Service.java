package com.jk.service;

import com.jk.pojo.CaiLiaoDb;
import com.jk.pojo.PeiZhi;
import com.jk.pojo.inquiryDXP;

import java.util.List;

public interface CldB14Service {

    void addCld(CaiLiaoDb caiLiaoDb);

    inquiryDXP queryInquiry(String id);

    List<PeiZhi> querypeizhi();
}