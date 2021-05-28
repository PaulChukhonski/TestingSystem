package by.testingSystem.service.impl;

import by.testingSystem.model.Statistic;
import by.testingSystem.service.StatisticService;

import java.util.List;

public class StatisticServiceImpl implements StatisticService {

    private final StatisticService statisticService;

    public StatisticServiceImpl(StatisticService statisticService) {
        this.statisticService = statisticService;
    }

    @Override
    public Statistic saveOrUpdate(Statistic statistic) {
        return statisticService.saveOrUpdate(statistic);
    }

    @Override
    public List<Statistic> findAll() {
        return statisticService.findAll();
    }

    @Override
    public Statistic findById(int id) {
        return statisticService.findById(id);
    }

    @Override
    public void delete(int id) {
        statisticService.delete(id);
    }
}
