package tn.esprit.spring.khaddem.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name = "Contrat")

public class Contrat implements Serializable {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idContrat")

    private Integer idContrat; // Clé primaire

    private Date dateDebutContract;

    private Date datefinContract;

    private boolean archive;

    private Integer montantContrat;

    @Enumerated(EnumType.STRING)

    private Specialite specialite;

    @ManyToOne()
    private Etudiant etudiant;


}


