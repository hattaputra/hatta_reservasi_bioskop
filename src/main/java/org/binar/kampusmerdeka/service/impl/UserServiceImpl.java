package org.binar.kampusmerdeka.service.impl;

import org.binar.kampusmerdeka.dto.MessageModel;
import org.binar.kampusmerdeka.entity.UserEntity;
import org.binar.kampusmerdeka.repository.UserRepo;
import org.binar.kampusmerdeka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public String insertUser(UserEntity user) {
        userRepo.save(user);

        return "berhasil";
    }

    @Override
    public List<UserEntity> getAllUser() {
        return userRepo.findAll();
    }
}
