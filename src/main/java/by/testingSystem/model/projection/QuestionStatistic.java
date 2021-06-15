package by.testingSystem.model.projection;

import lombok.Data;


public interface QuestionStatistic {
    String getDescription();
    int getNumberOfPassesOfQuestion();
    double getPercentageOfCorrectAnswers();
}
