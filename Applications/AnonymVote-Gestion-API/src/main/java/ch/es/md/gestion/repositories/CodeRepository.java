package ch.es.md.gestion.repositories;

import ch.es.md.gestion.Entities.CodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeRepository extends JpaRepository<CodeEntity, Integer> {
    CodeEntity findById(int id);
}
