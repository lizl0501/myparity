package com.jk.service;

import com.jk.mapper.XzlmMapper;
import com.jk.pojo.XzlmTrenchBean;
import com.jk.pojo.XzlmTypeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XzlmServiceImpl implements XzlmService {

    @Autowired
    private XzlmMapper xzlmMapper;

    @Override
    public List<XzlmTrenchBean> queryXzlmTrenchBean() {
        return xzlmMapper.queryXzlmTrenchBean();
    }

    @Override
    public List<XzlmTypeBean> queryXzlmTypeBean(String pid) {
        return xzlmMapper.queryXzlmTypeBean(pid);
    }
}
