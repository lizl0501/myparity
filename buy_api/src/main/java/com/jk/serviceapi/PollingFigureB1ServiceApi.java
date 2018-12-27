package com.jk.serviceapi;

import com.jk.pojo.PollingFigureBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("PollingFigureServiceApi")
public interface PollingFigureB1ServiceApi {
    @GetMapping("Goodsselect")
    List<PollingFigureBean> selectPollingFigure();

    @GetMapping("PollingFigureHx")
    PollingFigureBean PollingFigureHx(@RequestParam("pollingfigureid") String pollingfigureid);
}
