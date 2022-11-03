package tn.esprit.spring.khaddem.controller;


import tn.esprit.spring.khaddem.services.DepartementService;
import tn.esprit.spring.khaddem.entities.Departement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping( "DepartementManagment")
@RestController
@AllArgsConstructor
public class DepartementController {

    DepartementService departementService;

    @GetMapping("/afficherAllDepartement")
    List<Departement> retrieveAllDepartement() {
        return departementService.retrieveAllDepartement();
    }

    @PostMapping("/ajouterDepartement")
    Departement AddDepartement(@RequestBody Departement dep) {
        return departementService.AddDepartement(dep);
    }

    @DeleteMapping("/supprimerDepartement/{idDepartement}")
    void DeleteDepartement(@PathVariable Integer idDepartement) {
        departementService.DeleteDepartement(idDepartement);
    }

    @PutMapping("/modifierDepartement")
    Departement UpdateDepartement(@RequestBody Departement dep) {
        return departementService.UpdateDepartement(dep);
    }

    @GetMapping("/afficherDepartement/{idDepartement}")
    Departement retrieveDepartement(Integer idDepartement) {
        return departementService.retrieveDepartement(idDepartement);
    }
    @GetMapping("/assignEtudiantToDepartement/{etudiantId}/{departementId}")
    String assignEtudiantToDepartement (@PathVariable(value = "etudiantId") Integer etudiantId, @PathVariable(value = "departementId") Integer departementId){
        departementService.assignEtudiantToDepartement(etudiantId,departementId);
        return "etudiant assigned to departement" ;
    }

}
