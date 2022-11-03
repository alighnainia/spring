package tn.esprit.spring.khaddem.services;

import tn.esprit.spring.khaddem.entities.Contrat;
import tn.esprit.spring.khaddem.entities.Equipe;
import tn.esprit.spring.khaddem.entities.Etudiant;
import tn.esprit.spring.khaddem.repositories.ContratRepository;
import tn.esprit.spring.khaddem.repositories.EquipeRepository;
import tn.esprit.spring.khaddem.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class EquipeServiceimpl implements EquipeService {
    EquipeRepository er;
    ContratRepository cr ;

    EtudiantRepository Er ;

    @Override
    public List<Equipe> retrieveAllEquipe() {

        return er.findAll();
    }

    @Override
    public Equipe AddEquipe(Equipe equipe) {

        return er.save(equipe);
    }

    @Override
    public void DeleteEquipe(Integer idEquipe) {
        er.deleteById(idEquipe);

    }

    @Override
    public Equipe UpdateEquipe(Equipe eq) {
        return er.save(eq);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {

        return er.findById(idEquipe).get();
    }

}
