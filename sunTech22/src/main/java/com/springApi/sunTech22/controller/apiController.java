package com.springApi.sunTech22.controller;

import com.springApi.sunTech22.model.Employee;
import com.springApi.sunTech22.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class apiController {
    // Get  : it is used to reterive data .
    // GetMapping .
    // Post  . it is used to add data .
    // PostMapping .
    // put   . it is used to update data .
    // PutMapping : data update .
    // delete  . it is used to delete .
    // DeleteMapping .

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/")
    public String welcome(){
        return "welcome in rest api .";
    }

    @GetMapping("/employees")
    public List<Employee> GETEmployees(){
        return this.employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{employee_id}")
    public Employee GetSpecialEmployee(@PathVariable String employee_id){
        return employeeService.getEmployees(Integer.parseInt(employee_id));
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.AddEmployee(employee);
    }
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.UpdateEmployee(employee);
    }
    @DeleteMapping("/employees/{employee_id}")
    public void deleteEmployee(@PathVariable String employee_id){
         employeeService.DeleteEmployee(Integer.parseInt(employee_id));
    }
}
