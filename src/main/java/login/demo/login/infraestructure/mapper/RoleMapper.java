package login.demo.login.infraestructure.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import login.demo.login.domain.dto.Role;
import login.demo.login.infraestructure.entities.RoleEntity;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mappings({
        @Mapping(source = "role", target = "role"),
        @Mapping(source = "assignmentDate", target = "assignmentDate")
    })
    Role toRole(RoleEntity roleEntity);

    List<Role> toRoles(List<RoleEntity> roleEntities);

    @InheritInverseConfiguration
    RoleEntity toRoleEntity(Role roleDto);
    
    List<RoleEntity> toRoleEntities(List<Role> roleDtos);
}
