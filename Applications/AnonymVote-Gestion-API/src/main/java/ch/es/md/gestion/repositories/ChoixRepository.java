package ch.es.md.gestion.repositories;

import ch.es.md.gestion.Entities.ChoixEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoixRepository extends JpaRepository<ChoixEntity, Integer> {
    @Query("select max(c.id_choix) from choix c")
    Integer findLastChoixId();
    ChoixEntity findById(int id);
    @Modifying
    @Query("delete from choix c where c.id_question = ?1")
    void deleteAllByQuestionId(int id);
}
