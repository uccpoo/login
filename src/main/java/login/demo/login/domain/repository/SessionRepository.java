package login.demo.login.domain.repository;
import java.util.List;

import login.demo.login.domain.dto.SessionDTO;

public interface SessionRepository {
    List<session> getAll();
    
}