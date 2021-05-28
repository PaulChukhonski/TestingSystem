package by.testingSystem.service;

import by.testingSystem.model.Literature;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LiteratureService {
    void create(Literature t);
    void delete(Literature t);
    void update(Literature t);
    void save(Literature t);
    List<Literature> findAll();
}
