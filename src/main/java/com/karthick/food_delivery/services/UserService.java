package com.karthick.food_delivery.services;

import com.karthick.food_delivery.controller.UserController;
import com.karthick.food_delivery.dto.Calculate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public int add(Calculate calculate)
    {
        return  calculate.getA()+calculate.getB();
    }
}
