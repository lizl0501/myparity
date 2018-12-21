package com.jk.service;

import com.jk.pojo.XzlmCustomBean;
import com.jk.pojo.XzlmTrenchBean;
import com.jk.serviceapi.XzlmServiceApi;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(value = "cloudprovider")
public interface XzlmCustomService extends XzlmServiceApi {

}
