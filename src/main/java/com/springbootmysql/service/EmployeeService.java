package com.springbootmysql.service;

import java.util.List;

import com.springbootmysql.entity.Employee;

public interface EmployeeService {
    List <Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
