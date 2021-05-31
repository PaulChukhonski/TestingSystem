package by.testingSystem.service.impl;

import by.testingSystem.model.Link;
import by.testingSystem.repository.LinkRepository;
import by.testingSystem.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class LinkServiceImpl implements LinkService {
    private final LinkRepository linkRepository;

    @Autowired
    public LinkServiceImpl(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @Transactional
    @Override
    public Link saveOrUpdate(Link link) { return linkRepository.save(link); }

    @Transactional
    @Override
    public List<Link> findAll() {
        return linkRepository.findAll();
    }

    @Transactional
    @Override
    public Link findById(int id) {
        return linkRepository.findById(id).get();
    }

    @Transactional
    @Override
    public void delete(int id) {
        linkRepository.deleteById(id);
    }
}
