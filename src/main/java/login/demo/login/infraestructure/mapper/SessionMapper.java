package login.demo.login.infraestructure.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import login.demo.login.domain.dto.Session;
import login.demo.login.infraestructure.entities.session;

@Mapper(componentModel = "spring")
public interface SessionMapper {

    @Mappings({
        @Mapping(source = "token", target = "token"),
        @Mapping(source = "assignmentDate", target = "expiration")
    })
    Session toSession(session sessionEntity);

    List<Session> toSessions(List<session> sessionEntities);

    @InheritInverseConfiguration
    Session toSessionEntity(Session sessionDto);
    
    List<session> toSessionEntities(List<Session> sessionDtos);
}
