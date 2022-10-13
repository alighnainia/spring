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
@Table( name = "Universite")
public class Universite implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idUniversite")
    private Integer idUniv; // Clé primaire
    private String nomUniv;
    // Constructeur et accesseurs (getters) et mutateurs (setters)
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> departements;
}