package tn.esprit.spring.khaddem.service;

import tn.esprit.spring.khaddem.entities.DetailEquipe;

import java.util.List;

public interface DetailEquipeService {

    DetailEquipe saveDetailEquipe(DetailEquipe de);

    Iterable<DetailEquipe> fetchDetailEquipeList();

    void deleteDetailEquipeById(int id);
}