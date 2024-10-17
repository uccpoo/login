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
        @Mapping(source = "roleName", target = "role"), // Mapea roleName a role
        @Mapping(source = "dateCreate", target = "assignmentDate", dateFormat = "timestamp") // Mapea dateCreate a assignmentDate
    })
    RoleDTO toRoleDTO(Role roleEntity);

    List<RoleDTO> toRoleDTOs(List<Role> roleEntities);

    @InheritInverseConfiguration
    Role toRoleEntity(RoleDTO roleDto);

    List<Role> toRoleEntities(List<RoleDTO> roleDtos);
}
