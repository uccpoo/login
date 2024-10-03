package login.demo.login.infraestructure.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import login.demo.login.domain.dto.UserDTO; 
import login.demo.login.domain.repository.UserRepository;
import login.demo.login.infraestructure.crud_interface.UserCrudRepository;
import login.demo.login.infraestructure.entities.User;
import login.demo.login.infraestructure.mapper.UserMapper;

@Repository
public class UserRepository implements UserRepositoryInterface {

    @Autowired
    private UserCrudRepository userCrudRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = (List<User>) userCrudRepository.findAll();
        return userMapper.toUserDTOs(users);
    }

    @Override
    public UserDTO getUserById(Long id) {
        User user = userCrudRepository.findById(id).orElse(null);
        return userMapper.toUserDTO(user);
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = userMapper.toUser(userDTO);
        user = userCrudRepository.save(user);
        return userMapper.toUserDTO(user);
    }

    @Override
    public void deleteUser(Long id) {
        userCrudRepository.deleteById(id);
    }

}
