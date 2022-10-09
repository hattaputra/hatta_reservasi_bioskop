package org.binar.kampusmerdeka.controller;

import org.binar.kampusmerdeka.dto.MessageModel;
import org.binar.kampusmerdeka.entity.UserEntity;
import org.binar.kampusmerdeka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getAllUser")
    public MessageModel getAllUser(@RequestParam String nama){
        MessageModel msg = new MessageModel();
        System.out.println(nama);

        try {
            List<UserEntity> test = userService.getAllUser(nama);
            msg.setMessage("SUCCES!");
            msg.setStatus(200);
            msg.setData(test);
        }catch (Exception e){
            e.printStackTrace();
        }

        return msg;
    }

    @PostMapping("/insert_user")
    public MessageModel insertUser(@RequestBody UserEntity user){
        MessageModel msg = new MessageModel();

        try {
            String test = userService.insertUser(user);
            msg.setMessage("SUCCES!");
            msg.setStatus(200);
        }catch (Exception e){
            e.printStackTrace();
        }

        return msg;
    }
}
