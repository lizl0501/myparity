package com.jk.service.providers;

import com.jk.serviceapi.providers.ProvidersServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="cloudprovider")
public interface ProvidersService extends ProvidersServiceApi {
}
