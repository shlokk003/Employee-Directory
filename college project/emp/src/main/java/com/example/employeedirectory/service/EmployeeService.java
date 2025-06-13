package com.example.employeedirectory.service;

import java.util.List;

import com.example.employeedirectory.model.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    void saveEmployee(Employee employee);
    void deleteEmployee(Long id);
    List<Employee> searchEmployees(String keyword);
}