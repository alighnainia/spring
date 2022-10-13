package tn.esprit.spring.khaddem.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Entity
@Table( name = "Equipe")
public class Equipe implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe")
    private Integer idEquipe; // Clé primaire
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niv;
    @OneToOne
    private DetailEquipe Detail_Equipe;
// Constructeur et accesseurs (getters) et mutateurs (setters)
    @ManyToMany(mappedBy="equipes", cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}