package com.example.login.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.login.domain.dto.UserDTO;
import com.example.login.domain.repository.UserRepository;
import com.example.login.infraestructure.mapper.UserMapper;

@Service
public class UserService {

    private final UserRepository userRepository; // Interfaz de repositorio
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<UserDTO> getAllUsers() {
        return userMapper.toUsersDTO(userRepository.findAll()); // Asumiendo que tienes un método findAll
    }

    public UserDTO getUserById(Integer id) {
        return userMapper.toUserDTO(userRepository.findById(id)
                .orElse(null)); // Manejo básico de la opción
    }

    public UserDTO createUser(UserDTO userDTO) {
        // Mapea DTO a entidad y guarda en la base de datos
        return userMapper.toUserDTO(userRepository.save(userMapper.toUser(userDTO)));
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id); // Asumiendo que deleteById existe
    }


}
