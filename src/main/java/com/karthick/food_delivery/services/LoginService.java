package com.karthick.food_delivery.services;

import com.karthick.food_delivery.dto.UserLoginDetails;
import com.karthick.food_delivery.dto.UserLoginResponseDetails;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
private UserLoginResponseDetails userLoginResponseDetails=new UserLoginResponseDetails();

    public UserLoginResponseDetails Login(UserLoginDetails userLoginDetails){
        if(!userLoginDetails.getEmail().isEmpty() && !userLoginDetails.getPassword().isEmpty())
        {
            userLoginResponseDetails.setCode("200");
            userLoginResponseDetails.setMessage("Login success");
            return  userLoginResponseDetails;
        }else {
            userLoginResponseDetails.setCode("400");
            userLoginResponseDetails.setMessage("Login Failure");
            return  userLoginResponseDetails;
        }
    }
}
