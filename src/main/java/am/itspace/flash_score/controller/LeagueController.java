package am.itspace.flash_score.controller;


import lombok.RequiredArgsConstructor;
import model.League;
import model.Team;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import service.LeagueService;
import service.TeamService;
import java.util.List;


@Controller
@RequiredArgsConstructor
public class LeagueController {

    private final LeagueService leagueService;
    private final TeamService teamService;


    @Value("${flash_score.spring.images.folder}")


    @GetMapping("/leagues")
    public String leaguePage(ModelMap modelMap) {
        List<League> findAllLeague = leagueService.getAllLeague();
        modelMap.addAttribute("league", findAllLeague);
        return "league";
    }

    @GetMapping("/league/{teams}")
    public String teamsPage(@PathVariable int teams, ModelMap modelMap) {
        List<Team> findAllTeam = teamService.getTeamsByLeague(teams);
        modelMap.addAttribute("team", findAllTeam);
        return "teams";
    }

}
