package org.binar.kampusmerdeka.service;

import org.binar.kampusmerdeka.dto.MessageModel;
import org.binar.kampusmerdeka.entity.UserEntity;

import java.util.List;

public interface UserService {
    String insertUser(UserEntity user);

    List<UserEntity> getAllUser();
}
