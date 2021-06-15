package by.testingSystem.service.impl;

import by.testingSystem.model.Role;
import by.testingSystem.model.User;
import by.testingSystem.model.projection.UserStatistic;
import by.testingSystem.repository.RoleRepository;
import by.testingSystem.repository.UserRepository;
import by.testingSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User saveOrUpdate(User user) {
        for (Role role : roleRepository.findAll()) {
            if (role.getRole().equals(user.getRole().getRole())) {
                user.setRole(role);
                break;
            }
        }
        String passwordBeforeEncoding = user.getPassword();
        user.setPassword(passwordEncoder.encode(passwordBeforeEncoding));
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int id) {
        Optional<User> byId = userRepository.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        } else {
            throw new IllegalArgumentException("User with such id=" + id + "does not exist");
        }
    }

    @Override
    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<UserStatistic> getStatistic() {
        return userRepository.getStatistic();
    }
}
