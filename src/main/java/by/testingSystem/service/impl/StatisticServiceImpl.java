package by.testingSystem.service.impl;

import by.testingSystem.model.Statistic;
import by.testingSystem.model.User;
import by.testingSystem.repository.StatisticRepository;
import by.testingSystem.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatisticServiceImpl implements StatisticService {

    private final StatisticRepository statisticRepository;

    @Autowired
    public StatisticServiceImpl(StatisticRepository statisticRepository) {
        this.statisticRepository = statisticRepository;
    }

    @Override
    public Statistic saveOrUpdate(Statistic statistic) {
        return statisticRepository.save(statistic);
    }

    @Override
    public List<Statistic> findAll() {
        return statisticRepository.findAll();
    }

    @Override
    public Statistic findById(int id) {
        Optional<Statistic> byId = statisticRepository.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        } else {
            throw new IllegalArgumentException("Statistic with such id=" + id + "does not exist");
        }
    }

    @Override
    public void delete(int id) {
        statisticRepository.deleteById(id);
    }
}
