package com.github.darkgambite.converterapi.controller;


import com.github.darkgambite.converterapi.model.User;
import com.github.darkgambite.converterapi.repositoty.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consulta")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> listar(){
        return userRepository.findAll();
    }
}
