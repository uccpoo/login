package com.example.login.domain.dto;

public class SessionDTO {

    private String token;      // Token de sesión
    private long expiration;   // Tiempo de expiración de la sesión

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getExpiration() {
        return expiration;
    }

    public void setExpiration(long expiration) {
        this.expiration = expiration;
    }
}
