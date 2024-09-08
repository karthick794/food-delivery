package com.karthick.food_delivery.controller;


import com.karthick.food_delivery.dto.Calculate;
import com.karthick.food_delivery.dto.UserLoginDetails;
import com.karthick.food_delivery.dto.UserLoginResponseDetails;
import com.karthick.food_delivery.services.LoginService;
import com.karthick.food_delivery.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/hello")
public class UserController {
    private final UserService userService;
    private final LoginService loginService;

    public UserController(UserService userService, LoginService loginService) {
        this.userService = userService;
        this.loginService = loginService;
    }

    @GetMapping
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @PostMapping
    public int add(@RequestBody Calculate calculate) {
        return calculate.getA() + calculate.getB();
    }

    @PutMapping(path = "/sub")
    public int sub(@RequestBody Calculate calculate) {
        return userService.add(calculate);
    }

    @PostMapping(path = "/login")
    public UserLoginResponseDetails login(@RequestBody UserLoginDetails userLoginDetails) {
        return loginService.Login(userLoginDetails);
    }
}
