package com.example.login.infraestructure.mapper;

import org.mapstruct.Mapper;

import com.example.login.domain.dto.SessionDTO;
import com.example.login.infraestructure.entities.Session;

@Mapper(componentModel = "spring")
public class SessionMapper {

    // Convertir Session a SessionDTO
    public static SessionDTO toDTO(Session session) {
        if (session == null) {
            return null;
        }
        
        SessionDTO dto = new SessionDTO();
        dto.setSessionId(session.getSessionId());
        dto.setUserId(session.getUser() != null ? session.getUser().getUserId() : null); // Asegúrate de tener getUserId() en la clase User
        dto.setToken(session.getToken());
        dto.setDateCreate(session.getDateCreate());
        dto.setAssignmentDate(session.getAssignmentDate());
        // Aquí puedes calcular y establecer la fecha de expiración si es necesario
        return dto;
    }

    // Convertir SessionDTO a Session
    public static Session toEntity(SessionDTO sessionDTO) {
        if (sessionDTO == null) {
            return null;
        }
        
        Session session = new Session();
        session.setSessionId(sessionDTO.getSessionId());
        // Aquí deberías establecer el usuario en función del ID, posiblemente usando un UserRepository
        // session.setUser(userRepository.findById(sessionDTO.getUserId()).orElse(null)); // Ejemplo
        session.setToken(sessionDTO.getToken());
        session.setDateCreate(sessionDTO.getDateCreate());
        session.setAssignmentDate(sessionDTO.getAssignmentDate());
        // Aquí puedes calcular y establecer la fecha de expiración si es necesario
        return session;
    }
}
