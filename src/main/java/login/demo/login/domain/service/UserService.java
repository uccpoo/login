package login.demo.login.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import login.demo.login.domain.dto.UserDTO;
import login.demo.login.domain.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository UserRepository;

    public List<UserDTO> getAll(){
        return UserRepository.getAllUsers();
    }
    
}