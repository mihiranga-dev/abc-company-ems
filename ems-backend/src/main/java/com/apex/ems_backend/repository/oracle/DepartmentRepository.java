package com.apex.ems_backend.repository.oracle;

import com.apex.ems_backend.model.oracle.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    // JpaRepository provides .save(), .findAll(), .delete() automatically
}
