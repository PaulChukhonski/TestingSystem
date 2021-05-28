package by.testingSystem.service;

import by.testingSystem.model.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService {
    Question saveOrUpdate(Question question);
    List<Question> findAll();
    Question findById(int id);
    void delete(int id);
}
