package tn.esprit.spring.khaddem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.spring.khaddem.entities.DetailEquipe;
import tn.esprit.spring.khaddem.repository.DetailEquipeRepository;

import java.util.ArrayList;
import java.util.List;

@Service

public class DetailEquipeServiceImpl implements DetailEquipeService{

    @Autowired
    private DetailEquipeRepository detailrepo;


    @Override
    public DetailEquipe saveDetailEquipe(DetailEquipe de){
        return detailrepo.save(de);
    }

    @GetMapping("/detailequipes")
    public Iterable<DetailEquipe> fetchDetailEquipeList(){
        return detailrepo.findAll();

    }
    @DeleteMapping("detailequipes/{id}")
    public void deleteDetailEquipeById(@PathVariable("id") int id){
        detailrepo.deleteById(id);
    }
}
