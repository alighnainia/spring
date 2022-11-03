package tn.esprit.spring.khaddem.repositories;

import tn.esprit.spring.khaddem.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.khaddem.entities.Equipe;
import tn.esprit.spring.khaddem.entities.Etudiant;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

    @Query("Select e from Etudiant e WHERE e.departement.idDepartement like %?1 ")
    List<Etudiant> getEtudiantByDepartement(Integer idDepartement);
}
