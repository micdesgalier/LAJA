package ch.es.md.gestion.repositories;

import ch.es.md.gestion.Entities.ChoixEntity;
import ch.es.md.gestion.Entities.QuestionEntity;
import ch.es.md.gestion.api.model.Choix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity, Integer> {
    QuestionEntity findById(int id);
    @Query("select max(q.id_question) from question q")
    Integer findLastQuestionId();
    @Query("select c from choix c where c.id_question = ?1")
    List<ChoixEntity> findAllChoixByQuestionId(int id);
}
