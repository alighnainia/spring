package tn.esprit.spring.khaddem.service;

import tn.esprit.spring.khaddem.entities.Contrat;

import java.util.List;

public interface ContratService {

    Contrat saveContrat(Contrat c);

    Iterable<Contrat> fetchContartList();

    void deleteContratById(int id);
}