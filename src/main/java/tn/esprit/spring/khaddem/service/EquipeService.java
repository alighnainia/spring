package tn.esprit.spring.khaddem.service;

import tn.esprit.spring.khaddem.entities.Equipe;

import java.util.List;

public interface EquipeService {

    Equipe saveEquipe(Equipe e);

    Iterable<Equipe> fetchEquipeList();

    void deleteEquipeById(int id);
}