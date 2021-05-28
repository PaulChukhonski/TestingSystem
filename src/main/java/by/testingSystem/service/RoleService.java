package by.testingSystem.service;

import by.testingSystem.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    Role saveOrUpdate(Role role);
    List<Role> findAll();
    Role findById(int id);
    Role findByRoleName(String name);
    void delete(int id);
}
