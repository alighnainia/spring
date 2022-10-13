package tn.esprit.spring.khaddem.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table( name = "Contrat")
public class Contrat implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private Integer idContrat; // Clé primaire
    private Date dateDebutContrat;
    private Date dateFinContrat;
    private boolean archive;
    private int montantContrat;
    @Enumerated(EnumType.STRING)
    private Specialite sp;
// Constructeur et accesseurs (getters) et mutateurs (setters)
    @ManyToOne
    Etudiant etudiant;
}