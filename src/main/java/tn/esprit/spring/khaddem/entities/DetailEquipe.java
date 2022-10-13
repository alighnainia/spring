package tn.esprit.spring.khaddem.entities;
import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter

@Entity
@Table( name = "DetailEquipe")
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe")
    private Integer idDetailEquipe; // Clé primaire
    private int salle;
    private String thematique;
    @OneToOne(mappedBy="Detail_Equipe")
    private Equipe equipe;
// Constructeur et accesseurs (getters) et mutateurs (setters)
}