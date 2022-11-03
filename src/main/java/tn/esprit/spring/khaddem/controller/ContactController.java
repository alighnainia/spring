package tn.esprit.spring.khaddem.controller;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.khaddem.entities.Contrat;
import tn.esprit.spring.khaddem.services.ContratServiceimpl;
import org.springframework.stereotype.Controller;
import tn.esprit.spring.khaddem.services.ContratService;


import java.util.List;



@Tag(name = "Contrat Managment")
@RestController
@AllArgsConstructor
@RequestMapping( "contrattt")
public class ContactController {
        ContratServiceimpl contratService;


    @PostMapping("/ajouterContrat")
    Contrat addContrat(@RequestBody Contrat c) {
        return contratService.AddContrat(c);
    }
    @PutMapping("/modifierContrat")
    Contrat updateContrat(@RequestBody Contrat c) {
        return contratService.UpdateContrat(c);
    }

    @GetMapping("/afficherAllContrats")
    List<Contrat> retrieveAllContrats() {
        return contratService.retrieveAllContrat();
    }

    @GetMapping("/afficherContrat/{idContrat}")
    Contrat retrieveContrat(@PathVariable Integer idContrat) {
        return contratService.retrieveContrat(idContrat);
    }
    @DeleteMapping("/supprimerContrat/{idContrat}")
    void deleteContrat(@PathVariable Integer idContrat) {

        contratService.DeleteContrat(idContrat);
    }
}