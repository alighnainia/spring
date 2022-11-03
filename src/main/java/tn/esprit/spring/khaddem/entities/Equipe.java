package tn.esprit.spring.khaddem.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "Equipe")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Equipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEquipe")
    private Integer idEquipe; // Clé primaire
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau ;

    @OneToOne (cascade = CascadeType.ALL)
    private DetailEquipe detailEquipe;

    @ManyToMany
    private Set<Etudiant>etudiants;


}
