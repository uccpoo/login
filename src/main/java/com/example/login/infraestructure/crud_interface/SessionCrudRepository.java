package com.example.login.infraestructure.crud_interface;

import org.springframework.data.repository.CrudRepository;
import com.example.login.infraestructure.entities.Session;

import java.util.List;

public interface SessionCrudRepository extends CrudRepository<Session, Long> {
    
    // Busca sesiones por ID de usuario
    List<Session> findByUserId(Integer  userId);
    
    // Busca sesiones activas
    List<Session> findByIsActive(boolean isActive);
    
    // Busca todas las sesiones
    List<Session> findAll();
    
    // Elimina una sesión por su ID
    void deleteById(Long id);
}
