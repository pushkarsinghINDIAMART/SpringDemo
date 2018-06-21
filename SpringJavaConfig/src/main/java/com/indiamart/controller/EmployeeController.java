package com.indiamart.controller;

import com.indiamart.model.Employee;
import com.indiamart.service.EmployeeService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/addemployee")
    public String addEmployee() {
        employeeService.addEmployee(new Employee(1,"Pushkar","Singh","Associate Software Programmer"));
        return "home";
    }

    @RequestMapping(value = "/")
    public String home(){
        return "home";
    }

}
