package com.example.login.infraestructure.crud_interface;

import org.springframework.data.repository.CrudRepository;
import com.example.login.infraestructure.entities.Role;

import java.util.List;

public interface RoleCrudRepository extends CrudRepository<Role, Long> {
    
    //List<Role> findByName(String name);
    
}