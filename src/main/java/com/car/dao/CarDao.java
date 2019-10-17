package com.car.dao;

import com.car.bean.CarBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CarDao {
    @Select("insert into car(id,name,price,color,describe,url,imgurl,typeid,sales_number,collect_number,cartype)")
    public boolean insertCar(int id,String name,String price,String color,String describe,String url,String imgurl,int typeid,int sales_number,int collect_number,String cartype);

    @Select("select * from car")
    public List<CarBean> selectAll();

    @Select("select * from car where name like '%${text}%'")
    public List<CarBean> selectByname(String name);

    @Select("select * from car")
    public List<CarBean> selectPage();


}
