package com.example.login.domain.dto;

import java.time.LocalDateTime;

public class UserDTO {

private Integer userID;         // ID del usuario
private String username;        // Nombre de usuario
private String password;        // Contraseña
private LocalDateTime dateCreate; // Fecha de creación
private LocalDateTime assignmentDate; // Fecha de asignación

// Getters y Setters

public Integer getUserID() {
    return userID;
}

public void setUserID(Integer userID) {
    this.userID = userID;
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

public UserDTO orElse(Object object) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'orElse'");
}
}