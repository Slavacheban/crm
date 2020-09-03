package com.example.crm.service;

import com.example.crm.model.UserEntity;
import com.example.crm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity getOneById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<UserEntity> getAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void save(UserEntity entity) {

    }
}
