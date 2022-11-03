package tn.esprit.spring.khaddem.services;

import tn.esprit.spring.khaddem.entities.Departement;
import tn.esprit.spring.khaddem.entities.Universite;
import tn.esprit.spring.khaddem.repositories.DepartementRepository;
import tn.esprit.spring.khaddem.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UniversiteServiceimpl implements UniversiteService {
    UniversiteRepository ur;
    DepartementRepository departementRepository ;

    @Override
    public List<Universite> retrieveAllUniversite() {
        return ur.findAll();
    }

    @Override
    public Universite AddUniversite(Universite un) {
        return ur.save(un);

    }

    @Override
    public void DeleteUniversite(Integer idUniv) {
        ur.deleteById(idUniv);

    }

    @Override
    public Universite UpdateUniversite(Universite un) {
      return ur.save(un);
    }

    @Override
    public Universite retrieveUniversite(Integer idUniv) {

        return ur.findById(idUniv).get();
    }
    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement){
        Universite uu= ur.findById(idUniversite).get();
        //  uu.setDepartements(departementRepository.findById(idDepartement));
        Departement dd= departementRepository.findById(idDepartement).get();
        uu.getDepartements().add(dd);

    }
}
