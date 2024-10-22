package com.example.login.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; // Usar tu interfaz de repositorio
import org.springframework.stereotype.Service; // Asegúrate de que esté bien importado

import com.example.login.domain.dto.RoleDTO;
import com.example.login.domain.repository.RoleRepository;
import com.example.login.infraestructure.mapper.RoleMapper;

@Service
public class RoleService {

    @Autowired
    
    private final RoleRepository roleRepository; // Usar la interfaz de repositorio
    private final RoleMapper roleMapper;
    
    public RoleService(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    public List<RoleDTO> getAllRoles() {
        return roleRepository.getAllRoles();
    }

    public RoleDTO getRoleById(Long id) {
        return roleRepository.getRoleById(id);
    }

    public RoleDTO createRole(RoleDTO roleDTO) {
        return roleRepository.createRole(roleDTO);
    }

    public void deleteRole(Long id) {
        roleRepository.deleteRole(id);
    }

    public List<RoleDTO> findRolesByName(String name) {
        return roleRepository.findRolesByName(name);
    }
}
