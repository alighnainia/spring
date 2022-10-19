package tn.esprit.spring.khaddem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.spring.khaddem.entities.Contrat;
import tn.esprit.spring.khaddem.entities.Departement;
import tn.esprit.spring.khaddem.repository.ContratRepository;

import java.util.ArrayList;
import java.util.List;

@Service

public class ContratServiceImpl implements ContratService{

    @Autowired
    private ContratRepository contratrepo;


    @Override
    public Contrat saveContrat(Contrat c){
        return contratrepo.save(c);
    }

    @GetMapping("/contacts")
    public Iterable<Contrat> fetchContartList(){
        return contratrepo.findAll();

    }
    @DeleteMapping("contrats/{id}")
    public void deleteContratById(@PathVariable("id") int id){
        contratrepo.deleteById(id);
    }
}