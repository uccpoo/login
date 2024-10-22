package com.example.login.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.domain.dto.UserDTO;
import com.example.login.domain.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/Users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public  List<UserDTO> getAllUsers() {
        return userService.getAll();
    }
}