package ch.es.md.reponses.repositories;

import ch.es.md.reponses.Entities.ReponseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReponseRepository extends JpaRepository<ReponseEntity, Integer> {
    ReponseEntity findById(int id);
    @Query("select r from reponse r where r.code = ?1")
    List<ReponseEntity> findAllByCode(String code);
    @Query("select r from reponse r where r.id_question = ?1")
    List<ReponseEntity> findAllByIdQuestion(Integer idQuestion);
    @Query("select r from reponse r where r.id_choix = ?1")
    List<ReponseEntity> findAllByIdChoix(Integer idCode);
}
