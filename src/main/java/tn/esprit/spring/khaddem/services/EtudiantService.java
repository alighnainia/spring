package tn.esprit.spring.khaddem.services;
import tn.esprit.spring.khaddem.entities.Contrat;
import tn.esprit.spring.khaddem.entities.Etudiant;

import java.util.List;

public interface EtudiantService {
    List<Etudiant> retrieveAllEtudiant ();

    Etudiant AddEtudiant (Etudiant et);

    void DeleteEtudiant (Integer idEtudiant);

    Etudiant UpdateEtudiant (Etudiant et);

    Etudiant retrieveEtudiant (Integer idEtudiant);
    boolean addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);

    List<Etudiant> getEtudiantByDepartement(Integer idDepartement );
}
