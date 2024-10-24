package com.example.login.domain.dto;

import java.util.Date;

public class SessionDTO {

    private Integer sessionId;  // ID de la sesión
    private Integer userId;     // ID del usuario
    private String token;       // Token de sesión
    private Date dateCreate;    // Fecha de creación de la sesión
    private Date assignmentDate; // Fecha de asignación de la sesión
    private Date expiration;     // Tiempo de expiración de la sesión

    // Getters y setters
    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }
}
