package by.testingSystem.service;

import by.testingSystem.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User saveOrUpdate(User user);
    List<User> findAll();
    User findById(int id);
    User findByLogin(String login);
    void delete(int id);

}
