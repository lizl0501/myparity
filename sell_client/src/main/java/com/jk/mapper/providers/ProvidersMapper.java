package com.jk.mapper.providers;

import com.jk.pojo.providers.Tt;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProvidersMapper {
    List<Tt> querySelect();

    List<Tt> SelectTt(@Param("page") Integer page, @Param("rows") Integer rows, @Param("tt") Tt tt);

    long selectTtCount(@Param("tt") Tt tt);
}
