package com.example.login.domain.dto;


public class RoleDTO {

    private String role;       // Rol del usuario 
    private long assignmentDate;  // Fecha de asignación del rol (en formato de timestamp)
    
    // Getters y Setters

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getAssignmentDate() {
        return assignmentDate;
    }

    public void setAssignmentDate(long assignmentDate) {
        this.assignmentDate = assignmentDate;
    }
}
