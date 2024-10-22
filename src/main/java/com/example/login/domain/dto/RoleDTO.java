package com.example.login.domain.dto;

import java.util.Date;

public class RoleDTO {

    private Integer roleId; // Añade este campo
    private String role; // Correspondiente al campo 'name' de la tabla Role
    private Date dateCreate; // Correspondiente a 'date_create'
    private Date assignmentDate; // Correspondiente a 'assignment_date'

    // Getters y Setters

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getAssignmentDate() {
        return assignmentDate;
    }

    public void setAssignmentDate(Date assignmentDate) {
        this.assignmentDate = assignmentDate;
    }
}
