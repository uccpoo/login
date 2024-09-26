package login.demo.login.domain.repository;

import java.util.List;

import login.demo.login.domain.dto.Role;

public interface RoleRepository {
    List<Role> getAll();
}
