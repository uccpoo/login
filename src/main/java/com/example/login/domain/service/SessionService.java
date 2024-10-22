package com.example.login.domain.service;

import com.example.login.domain.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.login.infraestructure.entities.Session;


import java.util.List;

@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    public List<Session> getAll() {
        return sessionRepository.getAllSession();
    }

    // Método para obtener una sesión por ID
    public Session getSessionById(Long id) {
        Object sessionObject = sessionRepository.findById(id);
        if (sessionObject == null) {
            throw new RuntimeException("Session not found");
        }
        return (Session) sessionObject;
    }

    // Método para crear una nueva sesión
    public Session createSession(Session session) {
        return sessionRepository.save(session);
    }

    // Método para eliminar una sesión por ID
    public void deleteSession(int id) {
        Long longId = Long.valueOf(id); // Convertir int a Long
        if (!sessionRepository.existsById(longId)) {
            throw new RuntimeException("Session not found");
        }
        sessionRepository.deleteById(longId);
    }
}