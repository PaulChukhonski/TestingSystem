package by.testingSystem.service.impl;

import by.testingSystem.model.Test;
import by.testingSystem.model.projection.QuestionStatistic;
import by.testingSystem.model.projection.TestStatistic;
import by.testingSystem.repository.TestRepository;
import by.testingSystem.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    private final TestRepository testRepository;

    @Autowired
    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Transactional
    @Override
    public Test saveOrUpdate(Test test) { return testRepository.save(test); }

    @Transactional
    @Override
    public List<Test> findAll() { return testRepository.findAll(); }

    @Transactional
    @Override
    public Test findById(int id) { return testRepository.findById(id).get(); }

    @Override
    public Test findByName(String name) {
        return testRepository.findByName(name);
    }

    @Transactional
    @Override
    public void delete(int id) { testRepository.deleteById(id); }

    @Override
    public List<TestStatistic> getStatistics() {
        return testRepository.getStatistics();
    }
}
