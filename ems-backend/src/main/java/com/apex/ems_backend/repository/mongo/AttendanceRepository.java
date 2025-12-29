package com.apex.ems_backend.repository.mongo;

import com.apex.ems_backend.model.mongo.Attendance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendanceRepository extends MongoRepository<Attendance, String> {

    // Custom method to find all attendance records for a specific employee from Oracle
    List<Attendance> findByEmployeeId(Long employeeId);

}
