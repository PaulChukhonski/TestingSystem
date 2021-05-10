package by.testingSystem.service.impl;

import by.testingSystem.model.Answer;
import by.testingSystem.repository.AnswerRepository;
import by.testingSystem.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {
    private AnswerRepository answerRepository;

    @Autowired
    public void setAnswerRepository(AnswerRepository answerRepository) { this.answerRepository = answerRepository; }

    @Transactional
    @Override
    public void create(Answer t) { answerRepository.create(t); }

    @Transactional
    @Override
    public void delete(Answer t) { answerRepository.delete(t); }

    @Transactional
    @Override
    public void update(Answer t) { answerRepository.update(t); }

    @Transactional
    @Override
    public void save(Answer t) { answerRepository.save(t); }

    @Transactional
    @Override
    public List<Answer> findAll() { return answerRepository.findAll(Answer.class); }
}
