package tn.esprit.spring.khaddem.repository;




import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.khaddem.entities.DetailEquipe;

@Repository
public interface DetailEquipeRepository extends PagingAndSortingRepository<DetailEquipe,Integer> {
}
