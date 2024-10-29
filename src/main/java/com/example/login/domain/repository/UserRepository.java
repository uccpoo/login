package com.example.login.domain.repository;

import java.util.List;

import com.example.login.domain.dto.UserDTO; 
import com.example.login.infraestructure.entities.User;

public interface UserRepository {
// Declarar una lista de usuarios
List<UserDTO> getAllUsers();

UserDTO getUserById(Integer id);

UserDTO createUser(UserDTO userDTO);

void deleteUser(Integer id);

List<UserDTO> findUsersByUsername(String username);

UserDTO saveUser (User user);
}