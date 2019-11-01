package com.car.carmanager;

import com.car.bean.CarBean;
import com.car.bean.Main_nav;
import com.car.controller.CarController;
import com.car.controller.ManagerController;
import com.car.dao.CarDao;
import com.car.dao.ChartDao;
import com.car.dao.ManagerDao;
import com.car.dao.NavDao;
import com.car.service.CarService;
import com.car.service.ManagerService;
import com.car.util.PageRequest;
import com.car.util.PageResult;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarManagerApplicationTests {
    @Autowired
    ManagerDao managerDao;

    @Autowired
    ManagerController managerController;

    @Autowired
    ChartDao chartdao;

    @Autowired
    ManagerService managerService;

    @Autowired
    NavDao navdao;

    @Test
    public  void testChartDao(){

        System.out.println(chartdao.CarSalesName());
        System.out.println(chartdao.CarSalesNum());

    }

    @Test
    public  void testDao(){
        System.out.println(navdao.findAllNav());
    }

//    @Test
//    public  void testnavcount(){
//        System.out.println(navdao.navNum());
//    }


    @Test
    public  void testDao2(){
        navdao.addNav("bb","bb");
    }

    @Test
    public  void testDao3(){
        navdao.deleteNavById(5);
    }

    @Test
    public  void testDao4(){
        navdao.updateNavById("cc","cc",4);
    }


    @Test
    public void contextLoads() {

 //       System.out.println(managerDao.loginByUsername("xm"));
        System.out.println(managerController.login("xm","321"));
    }

    @Autowired
    CarController carController;
    @Test
    public void pageText(){
        PageRequest pageRequest=new PageRequest(1,5);
        System.out.println(carController.findPage(pageRequest));
    }
    @Autowired
    CarDao carDao;



    @Test
    public void selectText(){
        CarService carService=new CarService();
        PageRequest pageRequest = new PageRequest(1, 3);

        PageInfo<CarBean> pageInfo = carService.getPageInfo(pageRequest);

    }

}
