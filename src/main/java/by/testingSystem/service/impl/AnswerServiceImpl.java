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
    private final AnswerRepository answerRepository;

    @Autowired
    public AnswerServiceImpl(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

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
