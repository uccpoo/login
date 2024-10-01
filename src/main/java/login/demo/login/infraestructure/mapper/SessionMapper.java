package login.demo.login.infraestructure.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.mysql.cj.Session;

import login.demo.login.domain.dto.sessionDTO;




@Mapper(componentModel = "spring")
public interface SessionMapper {

    @Mappings({
        @Mapping(source = "token", target = "token"),
        @Mapping(source = "assignmentDate", target = "expiration")
    })
    Session toSession(sessionDTO sessionEntity);

    List<Session> toSessions(List<sessionDTO> sessionEntities);

    @InheritInverseConfiguration
    Session toSessionEntity(Session sessionDto);
    
    List<sessionDTO> toSessionEntities(List<Session> sessionDtos);
}
