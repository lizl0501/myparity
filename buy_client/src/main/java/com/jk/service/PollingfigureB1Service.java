package com.jk.service;


import com.jk.pojo.PollingFigureBean;

import java.util.List;

public interface PollingfigureB1Service {

    List<PollingFigureBean> selectPollingFigure();

    void savePollingFigure(PollingFigureBean pollingFigureBean);
}
