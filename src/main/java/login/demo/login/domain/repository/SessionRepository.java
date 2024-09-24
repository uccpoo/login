package login.demo.login.domain.repository;

import login.demo.login.infraestructure.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
    // Aquí puedes agregar métodos específicos si es necesario
    Session findByToken(String token);
}
