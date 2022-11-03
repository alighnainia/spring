package tn.esprit.spring.khaddem.repositories;
import tn.esprit.spring.khaddem.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {
}
