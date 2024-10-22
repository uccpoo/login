package com.example.login.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.login.domain.dto.UserDTO;
import com.example.login.domain.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository UserRepository;

    public List<UserDTO> getAll(){
        return UserRepository.getAllUsers();
    }
    
}