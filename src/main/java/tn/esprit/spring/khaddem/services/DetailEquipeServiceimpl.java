package tn.esprit.spring.khaddem.services;

import tn.esprit.spring.khaddem.entities.DetailEquipe;
import tn.esprit.spring.khaddem.repositories.DetailEquipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class DetailEquipeServiceimpl implements DetailEquipeService{
    DetailEquipeRepository der;
    @Override
    public List<DetailEquipe> retrieveAllDetailEquipe() {
        return der.findAll();
    }

    @Override
    public DetailEquipe AddDetailEquipe(DetailEquipe dep) {
        return der.save(dep);
    }

    @Override
    public void DeleteDetailEquipe(Integer idDetailEquipe) {

        der.deleteById(idDetailEquipe);
    }

    @Override
    public DetailEquipe UpdateDetailEquipe(DetailEquipe de) {
       return der.save(de);
    }

    @Override
    public DetailEquipe retrieveDetailEquipe(Integer idDetailEquipe) {
        return der.findById(idDetailEquipe).get();
    }
}
