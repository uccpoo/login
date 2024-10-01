package login.demo.login.infraestructure.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import login.demo.login.domain.dto.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mappings({
        @Mapping(source = "role", target = "role"),
        @Mapping(source = "assignmentDate", target = "assignmentDate")
    })
    Role toRole(Role roleEntity);

    List<Role> toRoles(List<Role> roleEntities);

    @InheritInverseConfiguration
    Role toRoleEntity(Role roleDto);
    
    List<Role> toRoleEntities(List<Role> roleDtos);
}
