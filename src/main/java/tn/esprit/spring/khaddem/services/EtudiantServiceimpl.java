package tn.esprit.spring.khaddem.services;

import tn.esprit.spring.khaddem.entities.Contrat;
import tn.esprit.spring.khaddem.entities.Equipe;
import tn.esprit.spring.khaddem.entities.Etudiant;
import tn.esprit.spring.khaddem.repositories.ContratRepository;
import tn.esprit.spring.khaddem.repositories.EquipeRepository;
import tn.esprit.spring.khaddem.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EtudiantServiceimpl implements EtudiantService{
    EtudiantRepository er ;
    ContratRepository cr ;

    EquipeRepository Er ;
    @Override
    public List<Etudiant> retrieveAllEtudiant() {
        return er.findAll();
    }

    @Override
    public Etudiant AddEtudiant(Etudiant et) {
       return er.save(et);

    }

    @Override
   public void DeleteEtudiant (Integer idEtudiant)
    {

        er.deleteById(idEtudiant);
    }

    @Override
    public Etudiant UpdateEtudiant(Etudiant et) {
      return er.save(et);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return er.findById(idEtudiant).get();
    }
    @Override
    public boolean addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe){
        Etudiant ee= er.save(e);
        Contrat cc = cr.findById(idContrat).get();
        Equipe eq = Er.findById(idEquipe).get();
        return ee.getEquipes().add(eq)  && ee.getContrats().add(cc) ;
    }

    @Override
    public List<Etudiant> getEtudiantByDepartement(Integer idDepartement) {
        return er.getEtudiantByDepartement(idDepartement);
    }



}
