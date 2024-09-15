package com.springApi.sunTech22.service;

import com.springApi.sunTech22.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployees(Integer employee_id);
    public Employee AddEmployee(Employee employee);
    public Employee UpdateEmployee(Employee employee);
    public void DeleteEmployee(Integer employee_id);
}
