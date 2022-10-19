package tn.esprit.spring.khaddem.service;


import tn.esprit.spring.khaddem.entities.Departement;

import java.util.List;

public interface DepartementService {

    Departement saveDepartement(Departement d);

    Iterable<Departement> fetchDepartementList();

    void deleteDepartementById(int id);
}
