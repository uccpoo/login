package com.example.login.domain.repository;

import java.util.List;
import com.example.login.domain.dto.SessionDTO;
import com.example.login.infraestructure.entities.Session;

public interface SessionRepository {
    
    List<SessionDTO> getAllUsers();
    
    List<Session> getAllSession();

    SessionDTO getSessionById(Long id);

    SessionDTO createSession(SessionDTO sessionDTO);

    void deleteSession(Long id);

    boolean existsById(Long id);

    List<SessionDTO> findSessionsByUserId(Integer userId);
}
