package am.itspace.flash_score.controller;
import lombok.RequiredArgsConstructor;
import model.Team;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.PlayerService;
import service.impl.TeamPlayerInfoServiceImpl;
import service.impl.TeamPlayersIdsServiceImpl;
import service.impl.TeamServiceImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class TeamController {
    private final TeamPlayerInfoServiceImpl teamPlayerInfoService;
    private final TeamPlayersIdsServiceImpl teamPlayersIdsService;

    @Value("${flashscore.spring.images.folder}")
    private String folderPathImages;

    @GetMapping("/team/{id}")
    public String currentTeamPage(@PathVariable int id, ModelMap modelMap){
        List<Team> findAllTeam = teamPlayerInfoService.findById(id);
        List<TeamPlayersIds> findPlayer = teamPlayersIdsService.findPlayerIdsByTeamId(id);
        modelMap.addAttribute("team", findAllTeam);
        modelMap.addAttribute("player", findPlayer);
        return "currentTeam";
    }
    @GetMapping("/player/getImage")
    public @ResponseBody byte[] getImage(@RequestParam("fileImage") String fileName) throws IOException {
        InputStream inputStream = new FileInputStream(folderPathImages + File.separator + fileName);
        return IOUtils.toByteArray(inputStream);
    }
}
