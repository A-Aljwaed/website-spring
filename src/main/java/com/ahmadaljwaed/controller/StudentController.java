package com.ahmadaljwaed.controller;


import com.ahmadaljwaed.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.ws.rs.GET;
import java.util.Objects;

@Controller
public class StudentController
{



    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/students", method =RequestMethod.GET)
public  String showStudentPage(ModelMap modelMap){
        modelMap.addAttribute("students",studentService.readStudents());
        return "students";
    }
}
