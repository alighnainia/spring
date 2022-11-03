package tn.esprit.spring.khaddem.controller;


import tn.esprit.spring.khaddem.services.DetailEquipeService;
import tn.esprit.spring.khaddem.entities.Contrat;
import tn.esprit.spring.khaddem.entities.DetailEquipe;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "DetailEquipe Managment")
@RestController
@AllArgsConstructor
@RequestMapping("detailequipe")
public class DetailEquipeController {
    DetailEquipeService detailEquipeService;


    @PostMapping("/ajouterDetailEquipe")
    DetailEquipe addDetailEquipe(@RequestBody DetailEquipe detailEquipe) {
        return detailEquipeService.AddDetailEquipe(detailEquipe);
    }
    @PutMapping("/modifierDetailEquipe")
    DetailEquipe updateDetailEquipe(@RequestBody DetailEquipe detailEquipe) {
        return detailEquipeService.UpdateDetailEquipe(detailEquipe);
    }

    @GetMapping("/afficherAllDetailEquipe")
    List<DetailEquipe> retrieveAllDetailEquipe() {
        return detailEquipeService.retrieveAllDetailEquipe();
    }

    @GetMapping("/afficherDetailEquipe/{idDetailEquipe}")
    DetailEquipe retrieveDetailEquipe(@PathVariable Integer idDetailEquipe) {
        return detailEquipeService.retrieveDetailEquipe(idDetailEquipe);
    }

    @DeleteMapping("/supprimerDetailEquipee/{idDetailEquipe}")
    void DeleteDetailEquipe(@PathVariable Integer idDetailEquipe) {
        detailEquipeService.DeleteDetailEquipe(idDetailEquipe);

    }

}
