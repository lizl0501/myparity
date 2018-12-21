package com.jk.service;

import com.jk.serviceapi.ViewOfferServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="cloudprovider")
public interface ViewOfferService extends ViewOfferServiceApi {
}
