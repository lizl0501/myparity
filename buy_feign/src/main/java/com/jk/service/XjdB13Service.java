package com.jk.service;

import com.jk.serviceapi.XjdB221Api;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="cloudprovider")
public interface XjdB13Service extends XjdB221Api {
}
