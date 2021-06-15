package by.testingSystem.repository;

import by.testingSystem.model.User;
import by.testingSystem.model.projection.UserStatistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByLogin(String login);

    @Query(value = "select us.firstName , us.lastName, us.name as testName, us.passed as countPassedTest, us.persent as percentCorrectAnswers from user_statistic us",nativeQuery = true)
    List<UserStatistic> getStatistic();
}
