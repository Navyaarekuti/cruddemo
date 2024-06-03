package com.learn2code.cruddemo.service;

import com.learn2code.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>findAll();
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);

}
