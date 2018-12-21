package com.jk.controller.providers;

import com.jk.pojo.providers.Tt;
import com.jk.service.providers.ProvidersService;
import com.jk.serviceapi.providers.ProvidersServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class ProvidersCOntrollerImpl implements ProvidersServiceApi {

    @Autowired
    private ProvidersService providersService;

    @Override
    public List<Tt> querySelect() {
        return providersService.querySelect();
    }

    @Override
    public HashMap<String, Object> SelectTt(Integer page, Integer rows,@RequestBody Tt tt) {
        return providersService.SelectTt(page,rows,tt);
    }
}
