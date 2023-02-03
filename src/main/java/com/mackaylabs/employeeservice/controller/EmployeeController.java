package com.mackaylabs.employeeservice.controller;

import com.mackaylabs.employeeservice.model.Employees;
import com.mackaylabs.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    // GET request to return a list of all employees
    @GetMapping("/employees")
    private Employees getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
