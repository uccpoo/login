package com.example.login.domain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.login.domain.dto.SessionDTO;
import com.example.login.infraestructure.entities.Session;
import com.example.login.domain.repository.SessionRepository;

@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    public List<SessionDTO> getAllSessions() {
        return sessionRepository.getAllSession().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public SessionDTO getSessionById(Integer id) {
        return sessionRepository.getSessionById(id);
    }

    public SessionDTO createSession(SessionDTO sessionDTO) {
        return sessionRepository.createSession(sessionDTO);
    }

    public void deleteSession(Integer id) {
        if (sessionRepository.existsById(id)) {
            sessionRepository.deleteSession(id);
        } else {
            throw new RuntimeException("Session not found");
        }
    }

    public boolean sessionExists(Integer id) {
        return sessionRepository.existsById(id);
    }

    public List<SessionDTO> findSessionsByUserId(Integer userId) {
        return sessionRepository.findSessionsByUserId(userId);
    }

    private SessionDTO convertToDTO(Session session) {
        if (session == null) {
            return null;
        }
        
        SessionDTO dto = new SessionDTO();
        dto.setSessionId(session.getSessionId());
        dto.setUserId(session.getUser().getUserId()); 
        dto.setToken(session.getToken());
        dto.setDateCreate(session.getDateCreate());
        dto.setAssignmentDate(session.getAssignmentDate());
        // Set expiration logic here if needed
        return dto;
    }
}
