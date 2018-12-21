package com.jk.service;

import com.jk.serviceapi.PollingFigureB1ServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="cloudprovider")
public interface PollingFigureB1Service extends PollingFigureB1ServiceApi {
}
