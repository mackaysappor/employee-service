package com.mackaylabs.employeeservice.service;

import com.mackaylabs.employeeservice.EmployeeManager;
import com.mackaylabs.employeeservice.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    EmployeeManager employeeManager = new EmployeeManager();

    public Employees getAllEmployees(){
        return employeeManager.getEmployees();
    }
}
