package com.jk.service;

import com.jk.serviceapi.CldB14ServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="cloudprovider")
public interface CldB14Service extends CldB14ServiceApi {
}
