package com.example.login.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.login.infraestructure.entities.Role;

public class RoleRepository {
    // Declarar una lista de roles
    private List<Role> roles;

    // Constructor para inicializar la lista de roles
    public RoleRepository() {
        this.roles = new ArrayList<>(); // Inicializar la lista
    }

    // Método para obtener todos los roles
    public List<Role> getAllRoles() {
        return roles; // Retorna la lista de roles
    }

    // Método para encontrar un rol por su nombre
    public Role findByRoleName(String roleName) {
        for (Role role : roles) {
            if (role.getRoleName().equals(roleName)) { // Compara el nombre del rol
                return role; // Devuelve el rol encontrado
            }
        }
        return null; // Retorna null si no se encuentra el rol
    }
}