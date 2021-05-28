package by.testingSystem.service.impl;

import by.testingSystem.model.Literature;
import by.testingSystem.repository.LiteratureRepository;
import by.testingSystem.service.LiteratureService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class LiteratureServiceImpl implements LiteratureService {
    private LiteratureRepository literatureRepository;

    @Autowired
    public void setLiteratureRepository(LiteratureRepository literatureRepository) { this.literatureRepository = literatureRepository; }

    @Transactional
    @Override
    public Literature saveOrUpdate(Literature literature) { return literatureRepository.save(literature); }

    @Transactional
    @Override
    public List<Literature> findAll() {
        return literatureRepository.findAll();
    }

    @Transactional
    @Override
    public Literature findById(int id) {
        return literatureRepository.findById(id).get();
    }

    @Transactional
    @Override
    public void delete(int id) {
        literatureRepository.deleteById(id);
    }
}
