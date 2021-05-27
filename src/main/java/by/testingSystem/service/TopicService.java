package by.testingSystem.service;

import by.testingSystem.model.Topic;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TopicService {
    Topic saveOrUpdate(Topic topic);
    List<Topic> findAll();
    Topic findById(int id);
    Topic findByName(String name);
    void delete(int id);
}
