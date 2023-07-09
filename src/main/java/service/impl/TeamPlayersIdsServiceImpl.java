package service.impl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamPlayersIdsServiceImpl implements TeamPlayerIdsServiceImpl {
    private final TeamPlayerIdsRepository teamPlayerIdsRepository;

    @Override
    public List<TeamPlayersIds> findPlayerIdsByTeamId(int id) {
        return teamPlayerIdsRepository.findPlayerIdsByTeamId(id);
    }
}
