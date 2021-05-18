package by.testingSystem.repository;

import by.testingSystem.model.Answer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AnswerRepository implements DaoRepository<Answer> {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) { this.sessionFactory = sessionFactory; }

    @Override
    public SessionFactory getBeanToBeAutowired() { return sessionFactory; }
}
