package com.apex.ems_backend.repository.oracle;

import com.apex.ems_backend.model.oracle.JobRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRoleRepository extends JpaRepository<JobRole, Long> {

}
