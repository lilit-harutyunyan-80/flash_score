package service.impl;


import lombok.RequiredArgsConstructor;
import model.League;
import org.springframework.stereotype.Service;
import repository.LeagueRepository;
import service.LeagueService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LeagueServiceImpl implements LeagueService {
    private final LeagueRepository leagueRepository;
    @Override
    public List<League> getAllLeague() {
        return leagueRepository.findAll();
    }

    @Override
    public List<League> getFiveLeague() {
        return leagueRepository.findTop5ByOrderById();
    }
    @Override
    public List<League> getUefaLeagues() {
        return leagueRepository.findByLeaguesContaining();
    }

}
