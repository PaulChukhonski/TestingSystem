package by.testingSystem.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int questionId;

    private String description;

    @ManyToOne
    @JoinColumn(name = "testId")
    private Test test;

    @OneToOne
    private Literature literature;

    @OneToMany(mappedBy = "question")
    private List<Answer> Answers;

    @OneToMany(mappedBy = "question")
    private List<Statistic> statistics;
}
