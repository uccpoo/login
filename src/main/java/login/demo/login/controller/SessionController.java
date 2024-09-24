import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO loginRequest) {
        

        String jwtToken = "jwt_token"; 

        LoginResponseDTO response = new LoginResponseDTO(jwtToken);
        return ResponseEntity.ok(response);
    }
}
