package login.demo.login.service;

import login.demo.login.domain.repository.SessionRepository;
import login.demo.login.infraestructure.entities.Session;
import login.demo.login.infraestructure.entities.SessionTokenDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SessionService {
    @Autowired
    private SessionRepository sessionRepository;

    // Método para crear una sesión
    public SessionTokenDTO createSession(String username, String password) {
        // Aquí va la lógica de autenticación
        String token = generateJwtToken(username); // Genera el token JWT

        Session session = new Session();
        session.setToken(token);
        session.setDateCreate(new Date());

        // Guarda la sesión en la base de datos
        sessionRepository.save(session);

        return new SessionTokenDTO(token);
    }

    // Otros métodos...
}
