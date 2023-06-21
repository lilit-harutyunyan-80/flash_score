package repository;


import model.League;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LeagueRepository extends JpaRepository<League, Integer> {
    List<League> findTop5ByOrderById();

    @Query(value = "SELECT * FROM league WHERE name LIKE 'uefa%'", nativeQuery = true)
    List<League> findByLeaguesContaining();


}
