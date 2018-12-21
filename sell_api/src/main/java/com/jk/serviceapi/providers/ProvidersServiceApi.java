package com.jk.serviceapi.providers;

import com.jk.pojo.providers.Tt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@RequestMapping("providersServiceApi")
public interface ProvidersServiceApi {


    @GetMapping("querySelect")
    List<Tt> querySelect();

    @PostMapping("SelectTt")
    HashMap<String, Object> SelectTt(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, Tt tt);
}
