package tn.esprit.spring.khaddem.controller;

import tn.esprit.spring.khaddem.services.EquipeService;
import tn.esprit.spring.khaddem.entities.Contrat;
import tn.esprit.spring.khaddem.entities.Equipe;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "Equipe Managment")
@RestController
@AllArgsConstructor
@RequestMapping("equipeservice")
public class EquipeController {
    EquipeService equipeService ;
    @GetMapping("/afficherAllEquipe")
    List<Equipe> retrieveAllEquipe() {
        return equipeService.retrieveAllEquipe();
    }
    @PostMapping("/ajouterEquipe")
    Equipe AddEquipe(@RequestBody Equipe equipe) {
        return equipeService.AddEquipe(equipe);
    }
    @DeleteMapping("/supprimerEquipe/{idEquipe}")
    void DeleteEquipe(@PathVariable Integer idEquipe) {
        equipeService.DeleteEquipe(idEquipe);
    }
    @PutMapping("/modifierEquipe")
    Equipe UpdateEquipe(@RequestBody Equipe eq) {

        return equipeService.UpdateEquipe(eq);
    }
    @GetMapping("/afficherEquipe")
    Equipe retrieveEquipe(@PathVariable Integer idEquipe) {

        return equipeService.retrieveEquipe(idEquipe);
    }
}
