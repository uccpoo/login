package com.example.login.domain.repository;

import java.util.List;
import com.example.login.domain.dto.SessionDTO;
import com.example.login.infraestructure.entities.Session;

public interface SessionRepository {
    
    List<SessionDTO> getAllUsers();
    
    List<Session> getAllSession();

    SessionDTO getSessionById(Integer id);

    SessionDTO createSession(SessionDTO sessionDTO);

    void deleteSession(Integer id);

    boolean existsById(Integer id);

    List<SessionDTO> findSessionsByUserId(Integer userId);
}
