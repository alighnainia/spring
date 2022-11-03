package tn.esprit.spring.khaddem.services;

import tn.esprit.spring.khaddem.entities.Contrat;

import java.util.List;

public interface ContratService {

    List<Contrat> retrieveAllContrat ();

    Contrat AddContrat (Contrat cont);

    void DeleteContrat (Integer idContrat);

    Contrat UpdateContrat (Contrat cont);

    Contrat retrieveContrat (Integer idContrat);
}
