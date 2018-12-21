package com.jk.service.providers;


import com.jk.pojo.providers.Tt;

import java.util.HashMap;
import java.util.List;

public interface ProvidersService {
    List<Tt> querySelect();

    HashMap<String, Object> SelectTt(Integer page, Integer rows, Tt tt);
}
