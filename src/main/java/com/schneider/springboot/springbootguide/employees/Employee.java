package com.schneider.springboot.springbootguide.employees;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="employee")
public class Employee {

    @Id
    @SequenceGenerator(name="employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence")
    private Long id;

    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private Integer age;
    private Integer salary;

    public Employee(Long id, String name, String email,
                    LocalDate dateOfBirth, Integer age, Integer salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }
}
