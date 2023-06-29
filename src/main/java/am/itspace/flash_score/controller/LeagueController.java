package am.itspace.flash_score.controller;


import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


@Controller
@RequiredArgsConstructor
public class LeagueController {
    private final LeagueService leagueService;
    private final TeamService teamService;


    @Value("${flash_score.spring.images.folder}")
    private String folderPathImages;


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

    @GetMapping("/leagues/getImage")
    public @ResponseBody byte[] getImage(@RequestParam("fileImage") String fileName) throws IOException {
        InputStream inputStream = new FileInputStream(folderPathImages + File.separator + fileName);
        return IOUtils.toByteArray(inputStream);
    }

    @GetMapping("/league/getVideo")
    public @ResponseBody byte[] getVideo(@RequestParam("leagueVideo") String fileName) throws IOException {
        InputStream inputStream = new FileInputStream( File.separator + fileName);
        return IOUtils.toByteArray(inputStream);
    }
}
