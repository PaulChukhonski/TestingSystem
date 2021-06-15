package by.testingSystem.service;

import by.testingSystem.model.Question;
import by.testingSystem.model.projection.QuestionStatistic;

import java.util.List;

public interface QuestionService {
    Question saveOrUpdate(Question question);
    List<Question> findAll();
    Question findById(int id);
    void delete(int id);
    List<QuestionStatistic> getStatistic();

}
