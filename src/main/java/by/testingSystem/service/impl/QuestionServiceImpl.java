package by.testingSystem.service.impl;

import by.testingSystem.model.Question;
import by.testingSystem.model.projection.QuestionStatistic;
import by.testingSystem.repository.QuestionRepository;
import by.testingSystem.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    private QuestionRepository questionRepository;

    @Autowired
    public void setQuestionRepository(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Transactional
    @Override
    public Question saveOrUpdate(Question question) {
        return questionRepository.save(question);
    }

    @Transactional
    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    @Transactional
    @Override
    public Question findById(int id) {
        return questionRepository.findById(id).get();
    }

    @Transactional
    @Override
    public void delete(int id) {
        questionRepository.deleteById(id);
    }

    @Override
    public List<QuestionStatistic> getStatistic() {
        return questionRepository.getStatistics();

    }

}
