package com.example.crm.service;

import com.example.crm.model.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity getOneById(Long id);
    List<UserEntity> getAll();
    void deleteById(Long id);
    void save(UserEntity entity);
}
