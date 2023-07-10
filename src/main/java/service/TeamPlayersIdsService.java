package service;

import model.TeamPlayersIds;

import java.util.List;

public interface TeamPlayersIdsService {
    List<TeamPlayersIds> findPlayerIdsByTeamId(int id);
}
