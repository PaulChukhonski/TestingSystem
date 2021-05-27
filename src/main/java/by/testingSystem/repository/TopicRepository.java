package by.testingSystem.repository;

import by.testingSystem.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic,Integer> {
    Topic findByName(String name);
}
