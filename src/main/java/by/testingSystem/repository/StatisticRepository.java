package by.testingSystem.repository;

import by.testingSystem.model.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatisticRepository extends JpaRepository<Statistic,Integer> {
}
