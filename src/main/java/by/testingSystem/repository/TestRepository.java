package by.testingSystem.repository;

import by.testingSystem.model.Test;
import by.testingSystem.model.projection.TestStatistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {
    @Query(value = "select name, passed_in_total as numberOfPassesOfTest, percentage_of_correct_answers as percentageOfCorrectAnswers from statistic_test",nativeQuery = true)
    List<TestStatistic> getStatistics();

    Test findByName(String name);
}
