package com.example.Employee_info.Controller;

import com.example.Employee_info.Model.Employee;
import com.example.Employee_info.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Employee")

public class Employeecontroller {
    @Autowired
    private Employeeservice service;

    @PostMapping("/addemp")
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.addEmployee(employee);
    }
}
