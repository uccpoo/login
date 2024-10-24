package com.example.login.infraestructure.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Session")
public class Session {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Session_ID")
    private Integer sessionId; // ID de la sesión

    @ManyToOne
    @JoinColumn(name = "User_ID", nullable = false)
    private User user; // Relación con el usuario

    @Column(nullable = false)
    private String token; // Token de sesión

    @Column(name = "date_create", nullable = false)
    private Date dateCreate; // Fecha de creación de la sesión

    @Column(name = "assignment_date")
    private Date assignmentDate; // Fecha de asignación de la sesión

    // Getters y Setters
    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
}
