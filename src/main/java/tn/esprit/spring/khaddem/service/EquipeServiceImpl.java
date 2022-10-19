package tn.esprit.spring.khaddem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.spring.khaddem.entities.Equipe;
import tn.esprit.spring.khaddem.repository.EquipeRepository;

import java.util.ArrayList;
import java.util.List;

@Service

public class EquipeServiceImpl implements EquipeService {

    @Autowired
    private EquipeRepository equiperepo;


    @Override
    public Equipe saveEquipe(Equipe e){
        return equiperepo.save(e);
    }

    @GetMapping("/equipes")
    public Iterable<Equipe> fetchEquipeList(){
        return equiperepo.findAll();

    }
    @DeleteMapping("equipes/{id}")
    public void deleteEquipeById(@PathVariable("id") int id){
        equiperepo.deleteById(id);
    }
}
