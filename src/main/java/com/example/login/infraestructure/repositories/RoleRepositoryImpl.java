package com.example.login.infraestructure.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.login.domain.dto.RoleDTO;
import com.example.login.infraestructure.crud_interface.RoleCrudRepository;
import com.example.login.infraestructure.entities.Role;
import com.example.login.infraestructure.mapper.RoleMapper;
import com.example.login.domain.repository.RoleRepository;

@Repository
public class RoleRepositoryImpl implements RoleRepository {

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
        return roleMapper.toRoleDTO(role);
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

    @Override
    public List<RoleDTO> findRolesByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findRolesByName'");
    }

    // Puedes agregar otros métodos según sea necesario, por ejemplo:
    // @Override
    // public List<RoleDTO> findRolesByName(String name) {
    //     List<Role> roles = roleCrudRepository.findByName(name);
    //     return roleMapper.toRoleDTOs(roles);
    // }
}
