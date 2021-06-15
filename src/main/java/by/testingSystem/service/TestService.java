package by.testingSystem.service;

import by.testingSystem.model.Test;
import by.testingSystem.model.projection.TestStatistic;

import java.util.List;

public interface TestService {
    Test saveOrUpdate(Test test);
    List<Test> findAll();
    Test findById(int id);
    Test findByName(String name);
    void delete(int id);
    List<TestStatistic> getStatistics();
}
