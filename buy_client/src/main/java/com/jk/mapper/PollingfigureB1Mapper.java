package com.jk.mapper;

import com.jk.pojo.PollingFigureBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PollingfigureB1Mapper {

    List<PollingFigureBean> selectPollingFigure();

    void  savePollingFigure(@Param("pollingFigureBean") PollingFigureBean pollingFigureBean);

    PollingFigureBean PollingFigureHx(@Param("pollingfigureid")String pollingfigureid);

    void  PollingFigureUpdate(@Param("pollingFigureBean") PollingFigureBean pollingFigureBean);
}
