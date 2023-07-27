package repository;

import model.TeamPlayerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamPlayerInfoRepository extends JpaRepository<TeamPlayerInfo, Integer> {
}
