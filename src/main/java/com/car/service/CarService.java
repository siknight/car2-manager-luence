package com.car.service;

import com.car.bean.CarBean;
import com.car.dao.CarDao;
import com.car.util.PageRequest;
import com.car.util.PageResult;
import com.car.util.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarService {

    @Autowired
    CarDao carDao;

    /**
     * 分页查询接口
     * @param pageRequest
     * @return
     */
    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest));
    }


    /**
     * 调用分页插件完成分页
     * @param pageQuery
     * @return
     */
    public PageInfo<CarBean> getPageInfo(PageRequest pageRequest) {

        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<CarBean> carBeanList = carDao.selectPage();

        return new PageInfo<CarBean>(carBeanList);
    }
}
