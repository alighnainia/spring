package tn.esprit.spring.khaddem.services;

import tn.esprit.spring.khaddem.entities.Contrat;
import tn.esprit.spring.khaddem.entities.Equipe;

import java.util.List;

public interface EquipeService  {

    List<Equipe> retrieveAllEquipe ();

    Equipe AddEquipe (Equipe equipe);

    void DeleteEquipe (Integer idEquipe);

    Equipe UpdateEquipe (Equipe eq);

    Equipe retrieveEquipe (Integer idEquipe);
}
