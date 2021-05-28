package by.testingSystem.service;

import by.testingSystem.model.Statistic;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StatisticService {
    Statistic saveOrUpdate(Statistic statistic);
    List<Statistic> findAll();
    Statistic findById(int id);
    void delete(int id);

}
