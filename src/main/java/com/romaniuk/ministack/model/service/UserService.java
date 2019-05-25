package com.romaniuk.ministack.model.service;

import com.romaniuk.ministack.model.entity.UserEntity;
import com.romaniuk.ministack.model.form.RegisterForm;
import com.romaniuk.ministack.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public boolean registerUser (RegisterForm registerForm){
        userRepository.save(new UserEntity(registerForm));
        return true;
    }



}
