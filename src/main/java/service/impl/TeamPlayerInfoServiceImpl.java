package service.impl;
import lombok.RequiredArgsConstructor;
import model.TeamPlayerInfo;
import org.springframework.stereotype.Service;
import repository.TeamPlayerInfoRepository;
import service.TeamPlayerInfoService;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TeamPlayerInfoServiceImpl implements TeamPlayerInfoService {
    private final TeamPlayerInfoRepository teamPlayerInfoRepository;
//    private final TeamRepository teamRepository;

    @Override
    public Optional<TeamPlayerInfo> findById(int teamId) {
        return teamPlayerInfoRepository.findById(teamId);
    }

}
