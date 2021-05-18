package by.testingSystem.service;

import by.testingSystem.model.Answer;

import java.util.List;

public interface AnswerService {
    void create(Answer t);
    void delete(Answer t);
    void update(Answer t);
    void save(Answer t);
    List<Answer> findAll();
}
