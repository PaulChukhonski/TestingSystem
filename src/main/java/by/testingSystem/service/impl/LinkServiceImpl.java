package by.testingSystem.service.impl;

import by.testingSystem.model.Link;
import by.testingSystem.repository.LinkRepository;
import by.testingSystem.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

public class LinkServiceImpl implements LinkService {
    private LinkRepository linkRepository;

    @Autowired
    public void setLinkRepository(LinkRepository linkRepository) { this.linkRepository = linkRepository; }

    @Transactional
    @Override
    public void create(Link t) { linkRepository.create(t); }

    @Transactional
    @Override
    public void delete(Link t) { linkRepository.delete(t); }

    @Transactional
    @Override
    public void update(Link t) { linkRepository.update(t); }

    @Transactional
    @Override
    public void save(Link t) { linkRepository.save(t); }

    @Transactional
    @Override
    public List<Link> findAll() { return linkRepository.findAll(Link.class); }
}
