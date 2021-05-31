package by.testingSystem.service;

import by.testingSystem.model.Test;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TestService {
    Test saveOrUpdate(Test test);
    List<Test> findAll();
    Test findById(int id);
    void delete(int id);
}
