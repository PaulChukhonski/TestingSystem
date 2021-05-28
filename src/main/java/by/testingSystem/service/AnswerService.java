package by.testingSystem.service;

import by.testingSystem.model.Answer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AnswerService {
    Answer saveOrUpdate(Answer answer);
    List<Answer> findAll();
    Answer findById(int id);
    void delete(int id);
}
