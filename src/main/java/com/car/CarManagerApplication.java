package com.car;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.car.dao")
public class CarManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarManagerApplication.class, args);
    }

}
