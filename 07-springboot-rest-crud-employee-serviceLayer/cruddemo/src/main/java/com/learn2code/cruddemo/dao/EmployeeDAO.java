package com.learn2code.cruddemo.dao;

import com.learn2code.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
