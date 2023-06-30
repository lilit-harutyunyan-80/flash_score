package service;
import model.League;

import java.util.List;

public interface LeagueService {
    List<League> getAllLeague();

    List<League> getFiveLeague();

    List<League> getUefaLeagues();

}
