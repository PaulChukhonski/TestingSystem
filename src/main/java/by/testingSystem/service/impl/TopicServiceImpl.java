package by.testingSystem.service.impl;

import by.testingSystem.model.Topic;
import by.testingSystem.repository.TopicRepository;
import by.testingSystem.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TopicServiceImpl implements TopicService {

    private final TopicRepository topicRepository;
    @Autowired
    public TopicServiceImpl(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    @Override
    public Topic saveOrUpdate(Topic topic) {
        return topicRepository.save(topic);
    }

    @Override
    public List<Topic> findAll() {
        return topicRepository.findAll();
    }

    @Override
    public Topic findById(int id) {
        Optional<Topic> byId = topicRepository.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        } else {
            throw new IllegalArgumentException("Topic with such id=" + id + "does not exist");
        }
    }

    @Override
    public Topic findByName(String name) {
        return topicRepository.findByName(name);
    }

    @Override
    public void delete(int id) {
        topicRepository.deleteById(id);
    }
}
