package login.demo.login.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import login.demo.login.infraestructure.entities.Role;
import login.demo.login.domain.repository.RoleRepository;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.getAllRoles();
    }

    public Role getRoleByName(String roleName) {
        return roleRepository.findByRoleName(roleName);
    }
}
