package login.demo.login.infraestructure.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import login.demo.login.domain.dto.RoleDTO;
import login.demo.login.infraestructure.crud_interface.RoleCrudRepository;
import login.demo.login.infraestructure.entities.Role;
import login.demo.login.infraestructure.mapper.RoleMapper;
import login.demo.login.infraestructure.repository.RoleRepository;


@Repository
public class RoleRepository implements RoleR|epository {

    @Autowired
    private RoleCrudRepository roleCrudRepository;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<RoleDTO> getAllRoles() {
        List<Role> roles = (List<Role>) roleCrudRepository.findAll();
        return roleMapper.toRoleDTOs(roles);
    }

    @Override
    public RoleDTO getRoleById(Long id) {
        Role role = roleCrudRepository.findById(id).orElse(null);
        return RoleMapper.toRoleDTO(role);
    }

    @Override
    public RoleDTO createRole(RoleDTO roleDTO) {
        Role role = roleMapper.toRole(roleDTO);
        role = roleCrudRepository.save(role);
        return roleMapper.toRoleDTO(role);
    }

    @Override
    public void deleteRole(Long id) {
        roleCrudRepository.deleteById(id);
    }

}
