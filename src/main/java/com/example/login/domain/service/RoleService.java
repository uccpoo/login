package com.example.login.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.login.domain.dto.RoleDTO;
import com.example.login.domain.repository.RoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class RoleService {

    private final RoleRepository roleRepository;
    private static final Logger logger = LoggerFactory.getLogger(RoleService.class);

    
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Transactional(readOnly = true)
    public List<RoleDTO> getAllRoles() {
        logger.info("Fetching all roles");
        return roleRepository.getAllRoles();
    }

    @Transactional(readOnly = true)
    public RoleDTO getRoleById(Long id) {
        logger.info("Fetching role with ID: {}", id);
        return roleRepository.getRoleById(id);
    }

    @Transactional
    public RoleDTO createRole(RoleDTO roleDTO) {
        // Add input validation if necessary
        logger.info("Creating role: {}", roleDTO);
        return roleRepository.createRole(roleDTO);
    }

    @Transactional
    public void deleteRole(Long id) {
        logger.info("Deleting role with ID: {}", id);
        roleRepository.deleteRole(id);
    }

    @Transactional(readOnly = true)
    public List<RoleDTO> findRolesByName(String name) {
        logger.info("Finding roles by name: {}", name);
        return roleRepository.findRolesByName(name);
    }
}