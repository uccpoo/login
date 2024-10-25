package com.example.login.infraestructure.crud_interface;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.login.infraestructure.entities.User;

public interface UserCrudRepository extends CrudRepository<User, Long> {

@Query(value="select u from users u where u.UserID = ?",  nativeQuery = true)

// Busca usuarios por nombre de usuario
List<User> findByUsername(String username);


// Busca usuarios por rol
//List<User> findByRole(String role);


}