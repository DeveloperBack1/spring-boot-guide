package com.schneider.springboot.springbootguide.service;

import com.schneider.springboot.springbootguide.employees.Employee;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getAllEmployees() {
            return List.of(new Employee(1L,"Max","max@yahoo.com",
                        LocalDate.of(1977,8,13), 47,10000),
                new Employee(2L,"Valeria","valeria@yahoo.com",
                        LocalDate.of(2000,1,28), 25,10000)
        );
    }
}
