package tn.esprit.spring.khaddem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.spring.khaddem.entities.Universite;
import tn.esprit.spring.khaddem.repository.UniversiteRepository;

import java.util.ArrayList;
import java.util.List;

@Service

public class UniversiteServiceImpl implements UniversiteService {

    @Autowired
    private UniversiteRepository universiterepo;


    @Override
    public Universite saveUniversite(Universite u){
        return universiterepo.save(u);
    }

    @GetMapping("/universites")
    public Iterable<Universite> fetchUniversiteList(){
        return universiterepo.findAll();

    }
    @DeleteMapping("universites/{id}")
    public void deleteUniversiteById(@PathVariable("id") int id){
        universiterepo.deleteById(id);
    }
}
