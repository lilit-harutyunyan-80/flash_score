package service;
import model.Player;

import java.util.List;

public interface PlayerService {
    List<Player> findPlayersByTeamId(int teamId);
}
