package tn.esprit.spring.khaddem.services;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import tn.esprit.spring.khaddem.entities.Contrat;
import tn.esprit.spring.khaddem.entities.Departement;
import tn.esprit.spring.khaddem.entities.Etudiant;
import tn.esprit.spring.khaddem.repositories.DepartementRepository;
import tn.esprit.spring.khaddem.repositories.EtudiantRepository;

@Service
@AllArgsConstructor
public class DepartementServiceimpl implements DepartementService{

    @Autowired
    DepartementRepository dr ;
    @Autowired
    EtudiantRepository etudiantRepository ;
    @Override
    public List<Departement> retrieveAllDepartement() {
        return dr.findAll();
    }

    @Override
    public Departement AddDepartement(Departement dep) {
        return dr.save(dep);
    }

    @Override
    public void DeleteDepartement(Integer idDepartement) {
        dr.deleteById(idDepartement);

    }

    @Override
    public Departement UpdateDepartement(Departement dep) {
        return dr.save(dep);   }

    @Override
    public Departement retrieveDepartement(Integer idDepartement) {
        return dr.findById(idDepartement).get();
    }
    @Override
    public void assignEtudiantToDepartement (Integer etudiantId, Integer departementId){
        Etudiant ee= etudiantRepository.findById(Integer.valueOf(etudiantId)).get();
        ee.setDepartement(dr.findById(departementId).get());
        etudiantRepository.save(ee);
    }


}
