package com.jk.mapper;

import com.jk.pojo.XzlmTrenchBean;
import com.jk.pojo.XzlmTypeBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XzlmMapper {

    List<XzlmTrenchBean> queryXzlmTrenchBean();

    List<XzlmTypeBean> queryXzlmTypeBean(@Param("pid") String pid);
}
