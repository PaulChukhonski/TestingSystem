package by.testingSystem.service;

import by.testingSystem.model.Literature;

import java.util.List;

public interface LiteratureService {
    void create(Literature t);
    void delete(Literature t);
    void update(Literature t);
    void save(Literature t);
    List<Literature> findAll();
}
