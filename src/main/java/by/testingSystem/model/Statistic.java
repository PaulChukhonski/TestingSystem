package by.testingSystem.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "statistic")
public class Statistic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int statisticId;

    @Column
    private LocalDate date = LocalDate.now();

    @Column
    private boolean correct;

    @ManyToOne()
    private Question question;

    @ManyToOne
    private User user;
}
