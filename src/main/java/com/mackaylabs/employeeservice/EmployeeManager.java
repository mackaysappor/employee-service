package com.mackaylabs.employeeservice;

import com.mackaylabs.employeeservice.model.Employee;
import com.mackaylabs.employeeservice.model.Employees;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private final Employees employees = new Employees();

    public EmployeeManager(){
        Employee employee1 = new Employee(1, "John", "Cena", "j.cena@gmail.com", "General Manager");
        Employee employee2 = new Employee(2, "Randy", "Orton", "r.orton@gmail.com", "Director");
        Employee employee3 = new Employee(3, "Bruno", "Mars", "b.mars@gmail.com", "Artiste");
        Employee employee4 = new Employee(4, "Dwayne", "Johnson", "d.johnson@gmail.com", "Junior Executive");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        employees.setEmployees(employeeList);
    }
    public Employees getEmployees() {
        return employees;
    }
}
