package com.jk.service;

import com.jk.mapper.PollingfigureB1Mapper;
import com.jk.pojo.PollingFigureBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PollingfigureB1ServiceImpl implements PollingfigureB1Service {

    @Resource
    private PollingfigureB1Mapper pollingfigureMapper;

    @Override
    public List<PollingFigureBean> selectPollingFigure() {
        return pollingfigureMapper.selectPollingFigure();
    }

    @Override
    public void savePollingFigure(PollingFigureBean pollingFigureBean) {
        pollingfigureMapper.savePollingFigure(pollingFigureBean);

    }
}
