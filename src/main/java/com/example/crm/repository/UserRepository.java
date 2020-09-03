package com.example.crm.repository;

import com.example.crm.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, UserEntity> {
}
