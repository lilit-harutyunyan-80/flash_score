package repository;

import model.TeamPlayersIds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TeamPlayerIdsRepository extends JpaRepository<TeamPlayersIds, Integer> {
    @Query(value = "SELECT tpi.* FROM team_players_ids tpi JOIN team t ON t.id = tpi.team_id WHERE tpi.team_id = :teamId", nativeQuery = true)
    List<TeamPlayersIds> findPlayerIdsByTeamId(@Param("teamId") int teamId);
}
