package login.demo.login.domain.repository;
import java.util.List;

import login.demo.login.domain.dto.User;

public interface UserRepository {
    List<User> getAll();
    
}
