package com.jk.service;

import com.jk.serviceapi.CustomServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="cloudprovider")
public interface CustomService extends CustomServiceApi {

}
