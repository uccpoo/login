package com.example.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; import org.springframework.http.HttpStatus; import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.DeleteMapping; import org.springframework.web.bind.annotation.GetMapping; import org.springframework.web.bind.annotation.PathVariable; import org.springframework.web.bind.annotation.PostMapping; import org.springframework.web.bind.annotation.RequestBody; import org.springframework.web.bind.annotation.RequestMapping; import org.springframework.web.bind.annotation.RestController;

import com.example.login.domain.dto.UserDTO; import com.example.login.domain.service.UserService;

@RestController @RequestMapping("/users") public class UserController {

@Autowired
private UserService userService;

@GetMapping
public ResponseEntity<List<UserDTO>> getAllUsers() {
    List<UserDTO> users = userService.getAllUsers();
    return ResponseEntity.ok(users);
}

@GetMapping("/{id}")
public ResponseEntity<UserDTO> getUserById(@PathVariable Integer id) {
    UserDTO user = userService.getUserById(id);
    if (user != null) {
        return ResponseEntity.ok(user);
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
}

@PostMapping
public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
    UserDTO createdUser = userService.createUser(userDTO);
    return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
}

@DeleteMapping("/{id}")
public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
    try {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
}