package com.schneider.springboot.springbootguide;

import com.schneider.springboot.springbootguide.employees.Employee;
import com.schneider.springboot.springbootguide.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class EmployeeConfig {
    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {

        return (args) -> {
            var employeeList = List.of(new Employee(null, "Max",
                            "max@yahoo.com", LocalDate.of(1977, 8, 13),
                            47, 10000
                    ),
                    new Employee(null, "Valeria",
                            "valeria@yahoo.com", LocalDate.of(2000, 1, 28),
                            25, 10000
                    )
            );
            employeeRepository.saveAll(employeeList);
        };
    }

}
