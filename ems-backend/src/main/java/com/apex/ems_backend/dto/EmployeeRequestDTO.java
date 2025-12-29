package com.apex.ems_backend.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeRequestDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate hireDate;

    private Long departmentId;
    private Long jobRoleId;

    private String username;
    private String password;
    private String role;
}
