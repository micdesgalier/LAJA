package ch.es.md.gestion.repositories;

import ch.es.md.gestion.Entities.QuestionEntity;
import ch.es.md.gestion.Entities.SondageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SondageRepository extends JpaRepository<SondageEntity, Integer> {
    SondageEntity findById(int id);

    @Query("select s from sondage s inner join code c on s.id_sondage = c.id_sondage inner join utilisateur u on c.id_utilisateur = u.id_utilisateur where u.login = ?1")
    List<SondageEntity> findAllSondagesUtilisateur(String login);

    @Query("select s from sondage s where s.ouvert = true")
    List<SondageEntity> findAllSondagesOuverts();

    @Query("select s from sondage s where s.ouvert = false AND s.bloque = false")
    List<SondageEntity> findAllSondagesCreation();

    @Query("select s from sondage s where s.ouvert = false AND s.bloque = true")
    List<SondageEntity> findAllSondagesFermes();

    @Query("select q from question q where q.id_sondage = ?1")
    List<QuestionEntity> findAllQuestionBySondageId(Integer id);
}
