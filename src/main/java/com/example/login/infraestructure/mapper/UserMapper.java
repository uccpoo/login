package com.example.login.infraestructure.mapper;
import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

import com.example.login.domain.dto.UserDTO;
import com.example.login.infraestructure.entities.User;

import org.mapstruct.Mapping;

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