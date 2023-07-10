package service.impl;
import lombok.RequiredArgsConstructor;
import model.TeamPlayersIds;
import org.springframework.stereotype.Service;
import repository.TeamPlayerIdsRepository;
import service.TeamPlayersIdsService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamPlayersIdsServiceImpl implements TeamPlayersIdsService {
    private final TeamPlayerIdsRepository teamPlayerIdsRepository;

    @Override
    public List<TeamPlayersIds> findPlayerIdsByTeamId(int id) {
        return teamPlayerIdsRepository.findPlayerIdsByTeamId(id);
    }
}
