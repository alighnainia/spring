package tn.esprit.spring.khaddem.service;

import tn.esprit.spring.khaddem.entities.Universite;

import java.util.List;

public interface UniversiteService {

    Universite saveUniversite(Universite u);

    Iterable<Universite> fetchUniversiteList();

    void deleteUniversiteById(int id);
}
