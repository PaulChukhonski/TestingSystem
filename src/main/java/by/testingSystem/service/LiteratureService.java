package by.testingSystem.service;

import by.testingSystem.model.Literature;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LiteratureService {
    Literature saveOrUpdate(Literature literature);
    List<Literature> findAll();
    Literature findById(int id);
    void delete(int id);
}
