package tn.esprit.spring.khaddem.services;

import tn.esprit.spring.khaddem.entities.Departement;

import java.util.List;


import tn.esprit.spring.khaddem.entities.Contrat;


import java.util.List;

public interface DepartementService {
    List<Departement> retrieveAllDepartement ();
    Departement AddDepartement (Departement dep);

    void DeleteDepartement (Integer idDepartement);

    Departement UpdateDepartement (Departement dep);

    Departement retrieveDepartement (Integer idDepartement);
    void assignEtudiantToDepartement (Integer etudiantId, Integer departementId);
}
