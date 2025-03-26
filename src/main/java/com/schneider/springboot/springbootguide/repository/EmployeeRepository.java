package com.schneider.springboot.springbootguide.repository;

import com.schneider.springboot.springbootguide.employees.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
