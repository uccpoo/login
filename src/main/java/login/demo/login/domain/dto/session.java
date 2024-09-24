package login.demo.login.infraestructure.entities;

public class SessionTokenDTO {
    private String token;

    public SessionTokenDTO(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
