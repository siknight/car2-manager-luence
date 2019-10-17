package com.car.controller;

import com.car.util.PageRequest;
import com.car.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CarController {


    CarService carService=new CarService();

    @PostMapping("/findPage")
    public Object findPage(@RequestBody PageRequest pageQuery) {

        return carService.findPage(pageQuery);
    }
}
