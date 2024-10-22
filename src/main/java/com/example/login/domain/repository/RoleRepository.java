package com.example.login.domain.repository;

import java.util.List;

import com.example.login.domain.dto.RoleDTO;

public interface RoleRepository {

    // Declarar una lista de roles
    List<RoleDTO> getAllRoles();

    RoleDTO getRoleById(Long id);

    RoleDTO createRole(RoleDTO roleDTO);

    void deleteRole(Long id);

    List<RoleDTO> findRolesByName(String name);
}
