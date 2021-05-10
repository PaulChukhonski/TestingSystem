package by.testingSystem.service;

import by.testingSystem.model.Link;

import java.util.List;

public interface LinkService {
    void create(Link t);
    void delete(Link t);
    void update(Link t);
    void save(Link t);
    List<Link> findAll();
}
