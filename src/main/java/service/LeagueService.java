package service;
import model.League;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LeagueService {
    List<League> getAllLeague();

    List<League> getFiveLeague();

    List<League> getUefaLeagues();

}
