
package tn.esprit.spring.khaddem.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.io.Serializable;
import lombok.*;
import java.util.Set;
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Departement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDepartement")

    private Integer idDepartement; // Clé primaire
    private String nomDepartement;

    @OneToMany(mappedBy = "departement")
    @JsonIgnore
    private Set<Etudiant> etudiants;


}
