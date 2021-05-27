package by.testingSystem.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int topicId;

    @Column
    private String description;

    @Column
    private String name;
}
