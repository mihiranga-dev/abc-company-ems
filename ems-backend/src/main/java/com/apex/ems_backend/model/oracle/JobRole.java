package com.apex.ems_backend.model.oracle;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "job_role")
@Data
public class JobRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Double minSalary;
    private Double maxSalary;
}
