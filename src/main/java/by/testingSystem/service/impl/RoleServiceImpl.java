package by.testingSystem.service.impl;

import by.testingSystem.model.Role;
import by.testingSystem.repository.RoleRepository;
import by.testingSystem.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role saveOrUpdate(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(int id) {
        Optional<Role> byId = roleRepository.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        } else {
            throw new IllegalArgumentException("Role with such id=" + id + "does not exist");
        }
    }

    @Override
    public Role findByRoleName(String name) {
        return roleRepository.findByRole(name);
    }

    @Override
    public void delete(int id) {
        roleRepository.deleteById(id);
    }
}
