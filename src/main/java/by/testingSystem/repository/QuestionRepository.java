package by.testingSystem.repository;

import by.testingSystem.model.Question;
import by.testingSystem.model.projection.QuestionStatistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    @Query(value = "select description, number_of_passes_of_question as numberOfPassesOfQuestion, percentage_of_correct_answers as percentageOfCorrectAnswers from question_statistic;",nativeQuery = true)
    List<QuestionStatistic> getStatistics();
}