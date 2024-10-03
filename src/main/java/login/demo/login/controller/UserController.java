package login.demo.login.controller;

import java.util.List;


import org.mapstruct.ap.shaded.freemarker.core.ReturnInstruction.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import login.demo.login.domain.dto.UserDTO;
import login.demo.login.domain.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/Users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public  List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}