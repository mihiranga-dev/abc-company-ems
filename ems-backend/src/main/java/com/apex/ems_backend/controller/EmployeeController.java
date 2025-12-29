package com.apex.ems_backend.controller;

import com.apex.ems_backend.dto.EmployeeRequestDTO;
import com.apex.ems_backend.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/onboard")
    public ResponseEntity<String> onboard(@RequestBody EmployeeRequestDTO dto) {
        String message = employeeService.onboardEmployee(dto);
        return ResponseEntity.ok(message);
    }
}
