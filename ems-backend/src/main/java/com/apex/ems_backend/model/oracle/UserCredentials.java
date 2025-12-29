package com.apex.ems_backend.model.oracle;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_credentials")
@Data
public class UserCredentials {
    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "emp_id")
    private Employee employee;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role; // 'Admin' , 'HR' , 'Manager' , 'Employee'

    private boolean isActive = true; // To deactivate accounts, employees who leave
}
