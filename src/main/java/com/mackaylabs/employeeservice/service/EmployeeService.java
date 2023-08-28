package com.mackaylabs.employeeservice.service;

import com.mackaylabs.employeeservice.EmployeeManager;
import com.mackaylabs.employeeservice.model.Employee;
import com.mackaylabs.employeeservice.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeManager employeeManager;

    // method to retrieve all employees
    public Employees getAllEmployees(){
        return employeeManager.getEmployees();
    }

    // method to create an employee
    public Employees createEmployee(Employee employee){
        employeeManager.getEmployees().getEmployees().add(employee);
        return employeeManager.getEmployees();
    }
}
