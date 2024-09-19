package login.demo.login.infraestructure.repositories;

import com.firstproject.poo.infraestructure.entities.Permission;
import org.springframework.data.repository.CrudRepository;

public interface PermissionCrudRepository extends CrudRepository<Permission, Integer> {
    List<Permission> findByName(String name);
}