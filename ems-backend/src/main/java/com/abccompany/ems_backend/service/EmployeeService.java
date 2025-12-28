package com.abccompany.ems_backend.service;

import com.abccompany.ems_backend.dto.EmployeeRequestDTO;
import com.abccompany.ems_backend.model.oracle.Department;
import com.abccompany.ems_backend.model.oracle.Employee;
import com.abccompany.ems_backend.model.oracle.JobRole;
import com.abccompany.ems_backend.model.oracle.UserCredentials;
import com.abccompany.ems_backend.repository.oracle.DepartmentRepository;
import com.abccompany.ems_backend.repository.oracle.EmployeeRepository;
import com.abccompany.ems_backend.repository.oracle.JobRoleRepository;
import com.abccompany.ems_backend.repository.oracle.UserCredentialsRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;
    private final JobRoleRepository jobRoleRepository;
    private final UserCredentialsRepository userCredentialsRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public String onboardEmployee(EmployeeRequestDTO dto) {

        Department dept = departmentRepository.findById(dto.getDepartmentId())
                .orElseThrow(() -> new RuntimeException("Department Not Found"));
        JobRole role = jobRoleRepository.findById(dto.getJobRoleId())
                .orElseThrow(() -> new RuntimeException("Job Role Not Found"));

        Employee employee = new Employee();
        employee.setFirstName(dto.getFirstName());
        employee.setLastName(dto.getLastName());
        employee.setEmail(dto.getEmail());
        employee.setPhoneNumber(dto.getPhoneNumber());
        employee.setHireDate(dto.getHireDate());
        employee.setDepartment(dept);
        employee.setJobRole(role);

        Employee savedEmployee = employeeRepository.save(employee);

        UserCredentials creds = new UserCredentials();
        creds.setEmployee(savedEmployee);
        creds.setUsername(dto.getUsername());

        creds.setPassword(passwordEncoder.encode(dto.getPassword()));
        creds.setRole(dto.getRole());

        userCredentialsRepository.save(creds);

        return "Employee onboard successfully with ID: " + savedEmployee.getId();
    }
}
