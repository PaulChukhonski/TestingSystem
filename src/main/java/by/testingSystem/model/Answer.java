package by.testingSystem.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answerId;

    private String description;

    private boolean correct;

    @ManyToOne
    @JoinColumn(name = "questionId")
    private Question questionId;
}
