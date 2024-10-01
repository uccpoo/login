package login.demo.login.infraestructure.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


import login.demo.login.domain.dto.RoleDTO;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mappings({
        @Mapping(source = "role", target = "role"),
        @Mapping(source = "assignmentDate", target = "assignmentDate")
    })
    RoleDTO toRole(RoleDTO roleEntity);

    List<RoleDTO> toRoles(List<RoleDTO> roleEntities);

    @InheritInverseConfiguration
    RoleDTO toRoleEntity(RoleDTO roleDto);
    
    List<RoleDTO> toRoleEntities(List<RoleDTO> roleDtos);
}
