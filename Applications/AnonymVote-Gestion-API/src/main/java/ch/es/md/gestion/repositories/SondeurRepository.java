package ch.es.md.gestion.repositories;

import ch.es.md.gestion.Entities.SondeurEntity;
import ch.es.md.gestion.api.model.Sondeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SondeurRepository extends JpaRepository<SondeurEntity, Integer> {
    SondeurEntity findById(int id);
    List<SondeurEntity> findByLoginLike(String login);
    @Query("select s from sondeur s where s.login like ?1")
    List<SondeurEntity> findByLoginLikeWithQuery(String login);
}
