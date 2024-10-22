package com.example.login.controller;


import com.example.login.domain.service.SessionService;
import com.example.login.infraestructure.entities.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Sessions")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping("/all")
    public List<Session> getAll() {
        return sessionService.getAll();
    }

    @PostMapping("/create")
    public void createSession(@RequestBody Session session) {
        sessionService.createSession(session);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSession(@PathVariable int id) {
        sessionService.deleteSession(id);
    }
}