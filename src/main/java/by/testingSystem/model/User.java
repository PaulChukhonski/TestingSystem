package by.testingSystem.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String login;

    @Column
    private String password;

    @OneToOne(cascade = CascadeType.REMOVE)
    private Role roleId;
}
