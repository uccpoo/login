package login.demo.login.domain.repository;
import java.util.List;

import login.demo.login.domain.dto.session;

public interface UserRepository {
    List<session> getAll();
    
}



