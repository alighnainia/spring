package tn.esprit.spring.khaddem.controller;

import tn.esprit.spring.khaddem.services.ContratServiceimpl;
import tn.esprit.spring.khaddem.services.EtudiantService;
import tn.esprit.spring.khaddem.entities.Contrat;
import tn.esprit.spring.khaddem.entities.Etudiant;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("EtudiantManagment")
@RestController
@AllArgsConstructor

public class EtudiantController {
     EtudiantService etudiantService ;

    @PostMapping("/ajouterEtudiant")

     Etudiant AddEtudiant(@RequestBody Etudiant et) {
         return etudiantService.AddEtudiant(et);
}
    @PutMapping("/modifierEtudiant")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.UpdateEtudiant(etudiant);
    }

    @GetMapping("/afficherAllEtudiants")
    List<Etudiant> retrieveEtudiant() {
        return etudiantService. retrieveAllEtudiant();
    }

    @GetMapping("/afficherEtudiant/{idEtudiant}")
    Etudiant retrieveEtudiant(@PathVariable Integer idEtudiant) {
        return etudiantService.retrieveEtudiant(idEtudiant);
    }
    @DeleteMapping("/supprimerEtudiant/{idEtudiant}")
    void deleteEtudiant(@PathVariable Integer idEtudiant) {
        etudiantService.DeleteEtudiant(idEtudiant);
    }

    @GetMapping("/retrieve-all-etudiants-by-departement/{idDepartement}")
    @ResponseBody
    public List<Etudiant> getEtudiantByDepartement(@PathVariable("idDepartement") Integer idDepartement) {
        return etudiantService.getEtudiantByDepartement(idDepartement);
    }
}
