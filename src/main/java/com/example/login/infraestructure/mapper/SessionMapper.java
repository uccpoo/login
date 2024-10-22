package com.example.login.infraestructure.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.login.domain.dto.SessionDTO;
import com.example.login.infraestructure.entities.Session;

@Mapper(componentModel = "spring")
public interface SessionMapper {

    @Mapping(source = "token", target = "token")
    @Mapping(source = "expiration", target = "assignmentDate") // Ignora si no necesitas establecerlo desde DTO// Asegúrate de que esto tenga sentido
    Session toSession(SessionDTO sessionDTO);

    List<Session> toSessions(List<SessionDTO> sessionDTOs);

    @InheritInverseConfiguration
    SessionDTO toSessionDTO(Session session);

    List<SessionDTO> toSessionDTOs(List<Session> sessions);
}
