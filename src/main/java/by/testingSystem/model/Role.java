package by.testingSystem.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;

    @Column
    private String role;
}
