package tn.esprit.spring.khaddem.service;

import tn.esprit.spring.khaddem.entities.Etudiant;

import java.util.List;

public interface EtudiantService {

    Etudiant saveEtudiant(Etudiant e);

    Iterable<Etudiant> fetchEtudiantList();

    void deleteEtudiantById(int id);
}
