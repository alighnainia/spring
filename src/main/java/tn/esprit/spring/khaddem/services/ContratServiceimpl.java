package tn.esprit.spring.khaddem.services;
import tn.esprit.spring.khaddem.repositories.ContratRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import tn.esprit.spring.khaddem.entities.Contrat;

@Service
@AllArgsConstructor
public class ContratServiceimpl implements ContratService {
    ContratRepository cr;

    @Override
    public List<Contrat> retrieveAllContrat() {
        return cr.findAll();
    }

    @Override
    public Contrat AddContrat(Contrat cont) {
        return cr.save(cont);
    }

    @Override
    public void DeleteContrat(Integer idContrat) {
        cr.deleteById(idContrat);
    }

    @Override
    public Contrat UpdateContrat(Contrat cont) {
      return cr.save(cont);

    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {

        return cr.findById(idContrat).get();
    }
}
