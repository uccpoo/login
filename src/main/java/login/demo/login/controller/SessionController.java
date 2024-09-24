import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private SessionService sessionService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO loginRequest) {
        try {
            // Llama al servicio para crear una sesión y obtener el token
            SessionTokenDTO sessionToken = sessionService.createSession(loginRequest.getUsername(), loginRequest.getPassword());
            
            // Crea la respuesta con el token JWT
            LoginResponseDTO response = new LoginResponseDTO(sessionToken.getToken());
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            // Maneja errores de autenticación (por ejemplo, credenciales inválidas)
            return ResponseEntity.status(401).body(new LoginResponseDTO("Invalid credentials")); // Puedes personalizar la respuesta
        }
    }
}
