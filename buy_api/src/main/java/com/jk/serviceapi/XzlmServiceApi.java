package com.jk.serviceapi;

import com.jk.pojo.XzlmTrenchBean;
import com.jk.pojo.XzlmTypeBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@RequestMapping("XzlmServiceApi")
public interface XzlmServiceApi {

    @GetMapping("queryXzlmTrenchBean")
    List<XzlmTrenchBean> queryXzlmTrenchBean();

    @GetMapping("queryXzlmTypeBean")
    List<XzlmTypeBean> queryXzlmTypeBean(@RequestParam("pid") String pid);

}
