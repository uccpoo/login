package com.example.login.infraestructure.repositories;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.login.domain.dto.SessionDTO;
import com.example.login.infraestructure.entities.Session;
import com.example.login.domain.repository.SessionRepository;
import com.example.login.infraestructure.mapper.SessionMapper;
import com.example.login.infraestructure.crud_interface.SessionCrudRepository;

@Repository
public class SessionRepositoryImpl implements SessionRepository {

    @Autowired
    private SessionCrudRepository sessionCrudRepository;

    @Override
    public List<SessionDTO> getAllUsers() {
        return null; 
    }

    @Override
    public List<Session> getAllSession() {
        return (List<Session>) sessionCrudRepository.findAll();
    }

    @Override
    public SessionDTO getSessionById(Integer id) {

        return sessionCrudRepository.findById(id)
                .map(SessionMapper::toDTO)
                .orElse(null);
    }

    @Override
    public SessionDTO createSession(SessionDTO sessionDTO) {
        Session session = SessionMapper.toEntity(sessionDTO);
        Session savedSession = sessionCrudRepository.save(session);
        return SessionMapper.toDTO(savedSession);
    }

    @Override
    public void deleteSession(Integer id) {
        sessionCrudRepository.deleteById(id);
    }

    @Override
    public boolean existsById(Integer id) {
        return sessionCrudRepository.existsById(id);
    }

    @Override
    public List<SessionDTO> findSessionsByUserId(Integer userId) {
        List<Session> sessions = sessionCrudRepository.findByUserId(userId);
        return sessions.stream()
                .map(SessionMapper::toDTO)
                .collect(Collectors.toList());
    }
}
