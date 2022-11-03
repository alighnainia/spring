package tn.esprit.spring.khaddem.entities;

import lombok.*;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Set;



@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table( name = "Etudiant")

public class Etudiant implements Serializable {

    @Id

    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column(name="idEtudiant")

    private Integer idEtudiant; // Clé primaire

    private String nomE;

    private String prenomE;

    @Enumerated(EnumType.STRING)

    private Option op;

    @OneToMany (mappedBy = "etudiant")
    private Set<Contrat> contrats;

    @ManyToOne ()
    private Departement departement;

    @ManyToMany (mappedBy = "etudiants")
    private Set <Equipe> equipes;


}


