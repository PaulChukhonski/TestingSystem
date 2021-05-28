package by.testingSystem.service.impl;

import by.testingSystem.model.Test;
import by.testingSystem.repository.TestRepository;
import by.testingSystem.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class TestServiceImpl implements TestService {
    private TestRepository testRepository;

    @Autowired
    public void setTestRepository(TestRepository testRepository) { this.testRepository = testRepository; }

    @Transactional
    @Override
    public Test saveOrUpdate(Test test) { return testRepository.save(test); }

    @Transactional
    @Override
    public List<Test> findAll() { return testRepository.findAll(); }

    @Transactional
    @Override
    public Test findById(int id) { return testRepository.findById(id).get(); }

    @Transactional
    @Override
    public void delete(int id) { testRepository.deleteById(id); }
}
