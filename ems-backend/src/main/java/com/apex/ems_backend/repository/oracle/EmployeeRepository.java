package com.apex.ems_backend.repository.oracle;

import com.apex.ems_backend.model.oracle.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Custom method for write the SQL to find employee by email
    Optional<Employee> findByEmail(String email);
}
