package login.demo.login.domain.service;

import login.demo.login.domain.dto.Role;
import login.demo.login.domain.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    // Método para obtener todos los roles
    public List<Role> getAll() {
        return roleRepository.getAll();
    }

    // Método para obtener un rol por su ID
    public Role getById(int roleId) {
        return roleRepository.getById(roleId);
    }

    // Método para crear un nuevo rol
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    // Método para eliminar un rol por su ID
    public boolean delete(int roleId) {
        return roleRepository.delete(roleId);
    }
}
