package by.testingSystem.repository;

import by.testingSystem.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findByRole(String roleName);
    // TODO: 5/27/21  Ask Alex can I use Data JPA in project?
}
