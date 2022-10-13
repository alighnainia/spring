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
@Table( name = "Departement")
public class Departement implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idDepartement")
    private Integer idDepart; // Clé primaire
    private String nomDepart;
// Constructeur et accesseurs (getters) et mutateurs (setters)

    @OneToMany(cascade = CascadeType.ALL, mappedBy="departement")
    private Set<Etudiant> etudiants;


}