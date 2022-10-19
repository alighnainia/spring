package tn.esprit.spring.khaddem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.spring.khaddem.entities.Contrat;
import tn.esprit.spring.khaddem.entities.Departement;
import tn.esprit.spring.khaddem.repository.ContratRepository;
import tn.esprit.spring.khaddem.repository.DepartementRepository;

import java.util.ArrayList;
import java.util.List;

@Service

public class DepartementServiceImpl implements DepartementService{

    @Autowired
    private DepartementRepository departrepo;


    @Override
    public Departement saveDepartement(Departement d){
        return departrepo.save(d);
    }

    @GetMapping("/departements")
    public Iterable<Departement> fetchDepartementList(){
        return departrepo.findAll();

    }
    @DeleteMapping("departements/{id}")
    public void deleteDepartementById(@PathVariable("id") int id){
        departrepo.deleteById(id);
    }
}