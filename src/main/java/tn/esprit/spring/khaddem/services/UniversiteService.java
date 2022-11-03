package tn.esprit.spring.khaddem.services;

import tn.esprit.spring.khaddem.entities.Etudiant;
import tn.esprit.spring.khaddem.entities.Universite;

import java.util.List;

public interface UniversiteService {
    List<Universite> retrieveAllUniversite();

    Universite AddUniversite(Universite un);

    void DeleteUniversite(Integer idUniv);

    Universite UpdateUniversite(Universite un);

    Universite retrieveUniversite(Integer idUniv);
    void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);
}
