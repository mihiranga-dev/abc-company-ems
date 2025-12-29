package com.apex.ems_backend.model.mongo;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "attendance_logs")
@Data
public class Attendance {
    @Id
    private String id;

    private Long employeeId; // This links with the oracle Employee Table

    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;

    private String status; // 'PRESENT' , 'LATE' , 'ON_LEAVE'

    private String ipAddress; // can track which network used
}
