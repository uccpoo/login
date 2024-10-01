package login.demo.login.infraestructure.mapper;
import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.springframework.web.bind.annotation.Mapping;



import login.demo.login.domain.dto.User;
import login.demo.login.domain.dto.UserDTO;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
        @Mapping(source = "UserID", target = "idUser"),
        @Mapping(source = "username", target = "username"),
    })
    User toUser(User user);
    List<User> toUsers(List<User> users);

    @InheritInverseConfiguration
    User toAutor(User user);
    List<User> toUsers(List<User> users)

}