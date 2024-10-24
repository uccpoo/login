package com.example.login.infraestructure.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.example.login.domain.dto.RoleDTO;
import com.example.login.infraestructure.entities.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mappings({
        @Mapping(source = "roleId", target = "roleId"), // Mapea 'roleId'
        @Mapping(source = "name", target = "role"), // Cambia 'role' a 'name'
        @Mapping(source = "dateCreate", target = "dateCreate"),
        @Mapping(source = "assignmentDate", target = "assignmentDate")
    })
    RoleDTO toRoleDTO(Role role);

    List<RoleDTO> toRoleDTOs(List<Role> roles);

    @InheritInverseConfiguration
    Role toRole(RoleDTO roleDTO);

    List<Role> toRoles(List<RoleDTO> roleDTOs);
}
