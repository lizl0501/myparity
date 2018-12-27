package com.jk.mapper;

import com.jk.pojo.CaiLiaoDb;
import com.jk.pojo.PeiZhi;
import com.jk.pojo.inquiryDXP;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CldB14Mapper {

    void addCld(@Param("cld") CaiLiaoDb caiLiaoDb);

    inquiryDXP queryInquiry(@Param("id") String id);

    List<PeiZhi> querypeizhi();
}