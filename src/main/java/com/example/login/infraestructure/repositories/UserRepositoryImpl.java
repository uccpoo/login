package com.example.login.infraestructure.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.login.domain.dto.UserDTO;
import com.example.login.domain.repository.UserRepository;
import com.example.login.infraestructure.crud_interface.UserCrudRepository;
import com.example.login.infraestructure.entities.User;

@Repository
public class UserRepositoryImpl implements UserRepository{

    private final UserCrudRepository userCrudRepository;

    @Autowired
    public UserRepositoryImpl(UserCrudRepository userCrudRepository) {
        this.userCrudRepository = userCrudRepository;
    }

    // Método para guardar un usuario
    public User save(User user) {
        return userCrudRepository.save(user);
    }

    // Método para buscar un usuario por ID
    public Optional<User> findById(Long id) {
        return userCrudRepository.findById(id);
    }

    // Método para buscar usuarios por nombre de usuario
    public List<User> findByUsername(String username) {
        return userCrudRepository.findByUsername(username);
    }

    // Método para buscar usuarios por rol
    // public List<User> findByRole(String role) {
    //     return userCrudRepository.findByRole(role);
    // }

    // Método para obtener todos los usuarios
    public List<User> findAll() {
        return (List<User>) userCrudRepository.findAll();
    }

    // Método para eliminar un usuario por ID
    public void deleteById(Long id) {
        userCrudRepository.deleteById(id);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllUsers'");
    }

    @Override
    public UserDTO getUserById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

    @Override
    public void deleteUser(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public List<UserDTO> findUsersByUsername(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUsersByUsername'");
    }

    @Override
    public UserDTO saveUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveUser'");
    }
}