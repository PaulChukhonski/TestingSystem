package by.testingSystem.service;

import by.testingSystem.model.Link;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LinkService {
    void create(Link t);
    void delete(Link t);
    void update(Link t);
    void save(Link t);
    List<Link> findAll();
}
