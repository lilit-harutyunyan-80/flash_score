package service.impl;


import lombok.RequiredArgsConstructor;
import model.Player;
import org.springframework.stereotype.Service;
import repository.PlayerRepository;
import service.PlayerService;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;
    @Override
    public List<Player> findPlayersByTeamId(int teamId) {
        return playerRepository.findPlayersByTeamId(teamId);
    }
}

