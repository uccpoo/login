package login.demo.login.infraestructure.crud_interface;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import login.demo.login.infraestructure.entities.User;

public interface UserCrudRepository extends CrudRepository<User, Long> {
    
    // Busca usuarios por nombre de usuario
    List<User> findByUsername(String username);
    
    // Busca usuarios por rol
    List<User> findByRole(String role);
    
    // Busca todos los usuarios
    List<User> findAll();
    
    // Elimina un usuario por su ID
    void deleteById(Long id);
}