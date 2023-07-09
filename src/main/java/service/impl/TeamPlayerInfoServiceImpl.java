package service.impl;
import lombok.RequiredArgsConstructor;
import model.Team;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamPlayerInfoServiceImpl implements TeamPlayerInfoService {
    private final TeamPlayerInfoRepository teamPlayerInfoRepository;
    private final TeamRepository teamRepository;

    @Override
    public List<Team> findById(int teamId) {
        return teamRepository.findById(teamId);
    }

}
