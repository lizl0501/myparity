package com.jk.service;

import com.jk.mapper.CldB14Mapper;
import com.jk.pojo.CaiLiaoDb;
import com.jk.pojo.inquiryDXP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CldB14ServiceImpl implements CldB14Service{
    @Autowired
    private CldB14Mapper cldB14Mapper;

    @Override
    public void addCld(CaiLiaoDb caiLiaoDb) {
        caiLiaoDb.setCid(UUID.randomUUID().toString());
        cldB14Mapper.addCld(caiLiaoDb);
    }

    @Override
    public inquiryDXP queryInquiry(String id) {
        return cldB14Mapper.queryInquiry(id);
    }

}
