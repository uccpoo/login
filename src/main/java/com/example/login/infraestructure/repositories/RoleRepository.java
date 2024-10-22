package com.example.login.infraestructure.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.login.domain.dto.RoleDTO;
import com.example.login.infraestructure.crud_interface.RoleCrudRepository;
import com.example.login.infraestructure.entities.Role;
import com.example.login.infraestructure.mapper.RoleMapper;

@Repository
public class RoleRepository {

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

    // Puedes agregar otros métodos según sea necesario, por ejemplo:
    public List<RoleDTO> findRolesByName(String name) {
        List<Role> roles = roleCrudRepository.findByName(name);
        return roleMapper.toRoleDTOs(roles);
    }
}
