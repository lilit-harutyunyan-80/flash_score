package repository;


import model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    @Query(value = "SELECT p.* " +
            "FROM player p " +
            "JOIN team t ON t.player_id = p.id " +
            "WHERE t.id = :teamId", nativeQuery = true)
    List<Player> findPlayersByTeamId(@Param("teamId") int teamId);

}
