package com.example.login.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.login.domain.repository.RoleRepository;
import com.example.login.infraestructure.entities.Role;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.getAllRoles();
    }

    public Role getRoleByName(String roleName) {
        return roleRepository.findByRoleName(roleName);
    }
}
