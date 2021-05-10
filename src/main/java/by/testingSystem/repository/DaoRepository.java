package by.testingSystem.repository;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DaoRepository<T> {
    SessionFactory getBeanToBeAutowired();

    default void create(T t) {
        getBeanToBeAutowired().getCurrentSession().saveOrUpdate(t);
    }

    default void update(T t) {
        getBeanToBeAutowired().getCurrentSession().update(t);
    }

    default void delete(T t) {
        getBeanToBeAutowired().getCurrentSession().delete(t);
    }

    default void save(T t) {
        getBeanToBeAutowired().getCurrentSession().save(t);
    }

    default List<T> findAll(Class T) { return getBeanToBeAutowired().getCurrentSession().createQuery("from " + T.getSimpleName()).list(); }
}
