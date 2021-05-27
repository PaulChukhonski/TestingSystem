package by.testingSystem.repository;

import by.testingSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByLogin(String login);
}