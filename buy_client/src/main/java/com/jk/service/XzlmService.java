package com.jk.service;

import com.jk.pojo.XzlmTrenchBean;
import com.jk.pojo.XzlmTypeBean;

import java.util.List;

public interface XzlmService {

    List<XzlmTrenchBean> queryXzlmTrenchBean();

    List<XzlmTypeBean> queryXzlmTypeBean(String pid);
}
