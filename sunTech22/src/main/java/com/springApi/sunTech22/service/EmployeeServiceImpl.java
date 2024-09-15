package com.springApi.sunTech22.service;

import com.springApi.sunTech22.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{


    List<Employee> list;
    EmployeeServiceImpl(){
        list=new ArrayList<>();
        list.add(new Employee(1,"mayank",30000,"Lucknow"));
        list.add(new Employee(2,"mahima",40000,"Gurgaon"));
        list.add(new Employee(3,"krishna",50000,"Delhi"));
    }
    @Override
    public List<Employee> getAllEmployees() {
        return list;
    }

    @Override
    public Employee getEmployees(Integer employee_id) {
        Employee emp=null;
        for(Employee employee:list){
            if(employee.getEmployee_id()==employee_id){
                emp=employee;
                break;
            }
        }
        return emp;
    }

    @Override
    public Employee AddEmployee(Employee employee) {
         list.add(employee);
         return employee;
    }

    @Override
    public Employee UpdateEmployee(Employee employee) {
        for(Employee emp:list){
            if(emp.getEmployee_id()== employee.getEmployee_id()){
                emp.setEmployee_id(employee.getEmployee_id());
                emp.setEmployee_name(employee.getEmployee_name());
                emp.setEmployee_city(employee.getEmployee_city());
                emp.setEmployee_salary(employee.getEmployee_salary());
            }
        }
        return employee;
    }

    @Override
    public void DeleteEmployee(Integer employee_id) {
        Integer em_id=null;
        Employee e=null;
        for(Employee emp:list){
            if(emp.getEmployee_id()==employee_id){
                em_id=emp.getEmployee_id();
                e=emp;
            }
        }
        if(em_id!=null){
            list.remove(e);
        }
    }
}
