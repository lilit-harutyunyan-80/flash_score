package service.impl;


import lombok.RequiredArgsConstructor;
import model.Team;
import org.springframework.stereotype.Service;
import repository.TeamRepository;
import service.TeamService;

import java.util.List;


@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {
    private final TeamRepository teamRepository;
    @Override
    public List<Team> getTeamsByLeague(int leagueName) {
        return teamRepository.findTeamsByLeague(leagueName);
    }
}
