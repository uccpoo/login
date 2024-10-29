package com.example.login.controller;

import com.example.login.domain.dto.SessionDTO;
import com.example.login.domain.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sessions")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    // Obtener todas las sesiones
    @GetMapping
    public ResponseEntity<List<SessionDTO>> getAllSessions() {
        List<SessionDTO> sessions = sessionService.getAllSessions();
        return ResponseEntity.ok(sessions);
    }

    // Obtener sesión por ID
    @GetMapping("/{id}")
    public ResponseEntity<SessionDTO> getSessionById(@PathVariable Integer id) {
        SessionDTO session = sessionService.getSessionById(id);
        if (session == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(session);
    }

    // Crear nueva sesión
    @PostMapping
    public ResponseEntity<SessionDTO> createSession(@RequestBody SessionDTO sessionDTO) {
        SessionDTO createdSession = sessionService.createSession(sessionDTO);
        return ResponseEntity.status(201).body(createdSession);
    }

    // Eliminar sesión
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSession(@PathVariable Integer id) {
        try {
            sessionService.deleteSession(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Verificar existencia de sesión
    @GetMapping("/exists/{id}")
    public ResponseEntity<Boolean> sessionExists(@PathVariable Integer id) {
        boolean exists = sessionService.sessionExists(id);
        return ResponseEntity.ok(exists);
    }

    // Encontrar sesiones por ID de usuario
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<SessionDTO>> findSessionsByUserId(@PathVariable Integer userId) {
        List<SessionDTO> sessions = sessionService.findSessionsByUserId(userId);
        return ResponseEntity.ok(sessions);
    }
}

