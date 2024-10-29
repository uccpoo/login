package com.example.login.infraestructure.mapper;

import java.util.List; import java.util.stream.Collectors;

import org.mapstruct.InheritInverseConfiguration; import org.mapstruct.Mapper; import org.mapstruct.Mapping; import org.mapstruct.Mappings;

import com.example.login.domain.dto.UserDTO; import com.example.login.infraestructure.entities.User;

@Mapper(componentModel = "spring") 
public interface UserMapper {

@Mappings({
    @Mapping(source = "userID", target = "userID"),
    @Mapping(source = "username", target = "username"),
    @Mapping(source = "password", target = "password"),
    @Mapping(source = "dateCreate", target = "dateCreate"),
    @Mapping(source = "assignmentDate", target = "assignmentDate")
})
UserDTO toUserDTO(UserDTO userDTO);

default List<UserDTO> toUsersDTO(List<UserDTO> list) {
    return list.stream()
                .map(this::toUserDTO)
                .collect(Collectors.toList());
}

@InheritInverseConfiguration
User toUser(UserDTO userDTO);

default List<User> toUsers(List<UserDTO> usersDTO) {
    return usersDTO.stream()
                   .map(this::toUser)
                   .collect(Collectors.toList());
}
}