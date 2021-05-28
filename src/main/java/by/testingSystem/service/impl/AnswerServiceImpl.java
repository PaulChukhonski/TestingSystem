package by.testingSystem.service.impl;

import by.testingSystem.model.Answer;
import by.testingSystem.repository.AnswerRepository;
import by.testingSystem.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class AnswerServiceImpl implements AnswerService {
    private AnswerRepository answerRepository;

    @Autowired
    public void setAnswerRepository(AnswerRepository answerRepository) { this.answerRepository = answerRepository; }

    @Transactional
    @Override
    public Answer saveOrUpdate(Answer answer) {
        return answerRepository.save(answer);
    }

    @Transactional
    @Override
    public List<Answer> findAll() {
        return answerRepository.findAll();
    }

    @Transactional
    @Override
    public Answer findById(int id) {
        return answerRepository.findById(id).get();
    }

    @Transactional
    @Override
    public void delete(int id) {
        answerRepository.deleteById(id);
    }
}
