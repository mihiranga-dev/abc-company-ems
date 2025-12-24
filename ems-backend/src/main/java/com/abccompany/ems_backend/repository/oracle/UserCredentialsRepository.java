package com.abccompany.ems_backend.repository.oracle;

import com.abccompany.ems_backend.model.oracle.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserCredentialsRepository extends JpaRepository<UserCredentials, Long> {

    // To find teh user when the try to login
    Optional<UserCredentials> findByUsername(String username);
}
