package service;

import model.TeamPlayerInfo;

import java.util.Optional;

public interface TeamPlayerInfoService {
    Optional<TeamPlayerInfo> findById(int teamId);
}
