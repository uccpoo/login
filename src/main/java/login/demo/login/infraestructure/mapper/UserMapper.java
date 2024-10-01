package login.demo.login.infraestructure.mapper;
import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;



import login.demo.login.infraestructure.entities.User;
import login.demo.login.domain.dto.UserDTO;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
        @Mapping(source = "UserID", target = "idUser"),
        @Mapping(source = "username", target = "username"),
    })
    UserDTO toUserDTO(User user);
    List<UserDTO> toUsersDTO(List<User> users);

    @InheritInverseConfiguration
    User toAutor(UserDTO userdto);
    List<User> toUsers(List<UserDTO> usersDTO);

}