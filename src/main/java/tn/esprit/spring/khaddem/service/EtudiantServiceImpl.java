package tn.esprit.spring.khaddem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.spring.khaddem.entities.Etudiant;
import tn.esprit.spring.khaddem.repository.EtudiantRepository;

import java.util.ArrayList;
import java.util.List;

@Service

public class EtudiantServiceImpl implements EtudiantService {

    @Autowired
    private EtudiantRepository etudiantrepo;


    @Override
    public Etudiant saveEtudiant(Etudiant e){
        return etudiantrepo.save(e);
    }

    @GetMapping("/etudiants")
    public Iterable<Etudiant> fetchEtudiantList(){
        return etudiantrepo.findAll();

    }
    @DeleteMapping("etudiants/{id}")
    public void deleteEtudiantById(@PathVariable("id") int id){
        etudiantrepo.deleteById(id);
    }
}
