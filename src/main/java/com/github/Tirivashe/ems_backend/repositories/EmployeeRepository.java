package com.github.Tirivashe.ems_backend.repositories;

import com.github.Tirivashe.ems_backend.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
