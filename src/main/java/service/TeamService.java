package service;
import model.Team;

import java.util.List;

public interface TeamService {

    List<Team> getTeamsByLeague(int leagueName);
}
