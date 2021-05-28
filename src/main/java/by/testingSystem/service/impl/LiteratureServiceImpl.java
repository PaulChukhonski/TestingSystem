package by.testingSystem.service.impl;

import by.testingSystem.model.Literature;
import by.testingSystem.repository.LiteratureRepository;
import by.testingSystem.service.LiteratureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

public class LiteratureServiceImpl implements LiteratureService {
    private LiteratureRepository literatureRepository;

    @Autowired
    public void setLiteratureRepository(LiteratureRepository literatureRepository) { this.literatureRepository = literatureRepository; }

    @Transactional
    @Override
    public void create(Literature t) { literatureRepository.create(t); }

    @Transactional
    @Override
    public void delete(Literature t) { literatureRepository.delete(t); }

    @Transactional
    @Override
    public void update(Literature t) { literatureRepository.update(t); }

    @Transactional
    @Override
    public void save(Literature t) { literatureRepository.save(t); }

    @Transactional
    @Override
    public List<Literature> findAll() { return literatureRepository.findAll(Literature.class); }
}
