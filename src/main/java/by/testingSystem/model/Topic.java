package by.testingSystem.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "topic")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int topicId;

    @Column
    private String description;

    @Column
    private String name;

    @ToString.Exclude
    @OneToMany(mappedBy = "topic", fetch = FetchType.EAGER)
    private List<Test> tests;
}
