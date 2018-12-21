package com.jk.service.providers;

import com.jk.mapper.providers.ProvidersMapper;
import com.jk.pojo.providers.Tt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ProvidersServiceImpl implements ProvidersService{

    @Autowired
    private ProvidersMapper providersMapper;

    @Override
    public List<Tt> querySelect() {
        return providersMapper.querySelect();
    }

    @Override
    public HashMap<String, Object> SelectTt(Integer page, Integer rows,Tt tt) {
        Integer start = (page-1)*rows;
        long count =providersMapper.selectTtCount(tt);
        List<Tt> userList=providersMapper.SelectTt(start,rows,tt);
        HashMap<String, Object> map =new HashMap<>();
        map.put("total", count);
        map.put("rows", userList);
        return map;
    }
}
