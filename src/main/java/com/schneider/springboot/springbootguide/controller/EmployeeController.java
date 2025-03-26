package com.schneider.springboot.springbootguide.controller;

import com.schneider.springboot.springbootguide.employees.Employee;
import com.schneider.springboot.springbootguide.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

   private final EmployeeService employeeService;

   public EmployeeController(EmployeeService employeeService) {
       this.employeeService = employeeService;
   }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }


}
