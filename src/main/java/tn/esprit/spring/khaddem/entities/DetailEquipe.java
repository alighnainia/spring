package tn.esprit.spring.khaddem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DetailEquipe")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class DetailEquipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetailEquipe")
    private Integer idDetailEquipe; // Clé primaire
    private Integer salle;
    private String thematique ;

    @OneToOne (mappedBy = "detailEquipe")
    @JsonIgnore
    private Equipe equipe;


}
