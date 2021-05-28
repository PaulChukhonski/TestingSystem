package by.testingSystem.repository;

import by.testingSystem.model.Literature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LiteratureRepository extends JpaRepository<Literature, Integer> {
}
