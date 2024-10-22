package com.example.login.domain.dto;

import java.util.Date;

public class SessionDTO {

    private String token;      // Token de sesión
    private Date expiration;   // Tiempo de expiración de la sesión

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }
}
