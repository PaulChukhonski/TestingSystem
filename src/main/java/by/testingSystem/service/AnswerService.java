package by.testingSystem.service;

import by.testingSystem.model.Answer;
ашч import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AnswerService {
    void create(Answer t);
    void delete(Answer t);
    void update(Answer t);
    void save(Answer t);
    List<Answer> findAll();
}
