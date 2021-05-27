package by.testingSystem.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "statistic")
public class Statistic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int statisticId;

    @Column
    private boolean correct;

//    @OneToOne
//    private Qustion questionId;
    // TODO: 5/27/21 add Question

    @OneToOne
    private User userId;
}
