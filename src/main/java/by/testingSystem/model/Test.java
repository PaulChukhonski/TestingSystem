package by.testingSystem.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int testId;

    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name = "topicId")
    private Topic topicId;
}
