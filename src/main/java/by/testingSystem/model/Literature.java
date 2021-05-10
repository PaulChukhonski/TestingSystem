package by.testingSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "literature")
public class Literature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int literatureId;
    private String description;
    private int questionId;
    @OneToOne(optional = false, mappedBy = "literature")
    private Link link;

    public int getLiteratureId() {
        return literatureId;
    }

    public void setLiteratureId(int literatureId) {
        this.literatureId = literatureId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public Link getLink() { return link; }

    public void setLink(Link link) { this.link = link; }

    @Override
    public String toString() {
        return "Literature{" +
                "literatureId=" + literatureId +
                ", description='" + description + '\'' +
                ", questionId=" + questionId +
                '}';
    }
}
