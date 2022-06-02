package ch.es.md.gestion.repositories;

import ch.es.md.gestion.Entities.SondageEntity;
import ch.es.md.gestion.Entities.UtilisateurEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilisateurRepository extends JpaRepository<UtilisateurEntity, Integer> {
    UtilisateurEntity findById(int id);
    @Query("select u from utilisateur u where u.login = ?1")
    UtilisateurEntity findByLogin(String login);
}
