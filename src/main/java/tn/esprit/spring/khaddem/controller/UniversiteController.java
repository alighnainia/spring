package tn.esprit.spring.khaddem.controller;

import tn.esprit.spring.khaddem.services.UniversiteService;
import tn.esprit.spring.khaddem.entities.Universite;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Universite Managment")
@RestController
@AllArgsConstructor
@RequestMapping("universite")
public class UniversiteController {
    UniversiteService universiteService;

    @GetMapping("/afficherAllUniversite")
    List<Universite> retrieveAllUniversite() {
        return universiteService.retrieveAllUniversite();
    }

    @PostMapping("/AjouterUniversite")
    Universite AddUniversite(@RequestBody Universite un) {
        return universiteService.AddUniversite(un);
    }

    @DeleteMapping("SupprimerUniversite/{idUniv}")
    void DeleteUniversite(@PathVariable Integer idUniv) {
        universiteService.DeleteUniversite(idUniv);
    }

    @PutMapping("ModifierUniversite")
    Universite UpdateUniversite(@RequestBody Universite un) {
        return universiteService.UpdateUniversite(un);
    }
   @GetMapping("afficherUniversite/{idUniv}")
    Universite retrieveUniversite(@PathVariable Integer idUniv) {
        return universiteService.retrieveUniversite(idUniv);
    }

    @GetMapping("/assignUniversiteToDepartement/{idUniversite}/{idDepartement}")
    String assignUniversiteToDepartement(@PathVariable(value = "idUniversite") Integer idUniversite,  @PathVariable(value = "idDepartement") Integer idDepartement){
        universiteService.assignUniversiteToDepartement(idUniversite,idDepartement);
        return "universite assigned to departement";
    }
}
