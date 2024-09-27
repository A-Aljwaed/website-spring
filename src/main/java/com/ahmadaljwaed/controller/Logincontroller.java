package com.ahmadaljwaed.controller;


import com.ahmadaljwaed.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.Access;

@Controller
public class Logincontroller {
@Autowired
    LoginService loginService ;


    @RequestMapping(value = "/login")
    //@ResponseBody
    public String loginPage(){

        return "WEB-INF/views/login.jsp";


    }

}
