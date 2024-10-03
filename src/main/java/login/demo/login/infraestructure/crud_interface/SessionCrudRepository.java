package login.demo.login.infraestructure.crud_interface;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import login.demo.login.infraestructure.entities.Session;

public interface SessionCrudRepository extends CrudRepository<Session, Long> {
    
    // Busca sesiones por ID de usuario
    List<Session> findByUserId(Long userId);
    
    // Busca sesiones activas
    List<Session> findByIsActive(boolean isActive);
    
    // Busca todas las sesiones
    List<Session> findAll();
    
    // Elimina una sesión por su ID
    void deleteById(Long id);
}
