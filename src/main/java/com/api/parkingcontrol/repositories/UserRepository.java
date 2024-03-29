package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.UserModel;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {
    Optional<UserModel> findByUsername(String username);
}
