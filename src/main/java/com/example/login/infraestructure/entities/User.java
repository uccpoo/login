package com.example.login.infraestructure.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column; import jakarta.persistence.Entity; import jakarta.persistence.GeneratedValue; import jakarta.persistence.GenerationType; import jakarta.persistence.Id; import jakarta.persistence.PrePersist; import jakarta.persistence.Table;

@Entity @Table(name = "Users") public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "UserID")
private Integer userId; // Correspondiente a UserID

@Column(name = "username", nullable = false, unique = true)
private String username;

@Column(name = "password", nullable = false)
private String password;

@Column(name = "date_create")
private LocalDateTime dateCreate;

@Column(name = "assignment_date")
private LocalDateTime assignmentDate;

// Método para establecer la fecha de creación automáticamente
@PrePersist
protected void onCreate() {
    this.dateCreate = LocalDateTime.now();
}

// Getters y Setters

public Integer getUserId() {
    return userId;
}

public void setUserId(Integer userId) {
    this.userId = userId;
}

public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public LocalDateTime getDateCreate() {
    return dateCreate;
}

public void setDateCreate(LocalDateTime dateCreate) {
    this.dateCreate = dateCreate;
}

public LocalDateTime getAssignmentDate() {
    return assignmentDate;
}

public void setAssignmentDate(LocalDateTime assignmentDate) {
    this.assignmentDate = assignmentDate;
}
}