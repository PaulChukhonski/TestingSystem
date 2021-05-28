package by.testingSystem.service;

import by.testingSystem.model.Link;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LinkService {
    Link saveOrUpdate(Link link);
    List<Link> findAll();
    Link findById(int id);
    void delete(int id);
}
