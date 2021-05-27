package by.testingSystem.service.impl;

import by.testingSystem.model.User;
import by.testingSystem.repository.UserRepository;
import by.testingSystem.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveOrUpdate(User user) {
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
}
