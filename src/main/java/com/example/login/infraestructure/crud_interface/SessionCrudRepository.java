package com.example.login.infraestructure.crud_interface;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.login.infraestructure.entities.Session;

import java.util.List;

public interface SessionCrudRepository extends CrudRepository<Session, Integer> {
    
    // Busca sesiones por ID de usuario
    @Query(value="select s from session s where s.User_ID = ?",  nativeQuery = true)
    List<Session> findByUserId(Integer  userId);
    
  
}
