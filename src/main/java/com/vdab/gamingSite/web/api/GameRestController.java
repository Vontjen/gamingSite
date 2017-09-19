package com.vdab.gamingSite.web.api;

import com.vdab.gamingSite.domain.Game;
import com.vdab.gamingSite.repo.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/game")
public class GameRestController {


    @Autowired
    private GameRepository gr;
    @RequestMapping(method = RequestMethod.GET , path = "all", produces = "application/json")
    public List<Game> allGames(){
        return gr.findAll();
    }


}
