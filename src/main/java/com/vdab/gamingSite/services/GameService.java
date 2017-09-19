package com.vdab.gamingSite.services;

import com.vdab.gamingSite.domain.Game;
import com.vdab.gamingSite.repo.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class GameService {

    @Autowired
    private GameRepository gr;

    public GameService(GameRepository gr) {
        this.gr=gr;
    }

    public Game findById(int id){
        return gr.findOne(id);
    }

    public void save(String name, String developer, String publisher, Date releaseDate){
        Game g = new Game(name, developer, publisher, releaseDate);
        gr.save(g);
    }

    public void save(Game g){
        gr.save(g);
    }


}
