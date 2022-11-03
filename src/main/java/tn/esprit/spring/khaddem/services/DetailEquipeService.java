package tn.esprit.spring.khaddem.services;

import tn.esprit.spring.khaddem.entities.Departement;
import tn.esprit.spring.khaddem.entities.DetailEquipe;

import java.util.List;

public interface DetailEquipeService {
    List<DetailEquipe> retrieveAllDetailEquipe ();

    DetailEquipe AddDetailEquipe (DetailEquipe dep);

    void DeleteDetailEquipe (Integer idDetailEquipe);

    DetailEquipe UpdateDetailEquipe (DetailEquipe de);

    DetailEquipe retrieveDetailEquipe (Integer idDetailEquipe);
}
