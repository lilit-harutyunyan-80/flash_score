package model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "league")
public class League {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String logo;
    @OneToOne
    @JoinColumn(name = "sport_id")
    private Sport sport;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

}
