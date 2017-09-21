package com.vdab.gamingSite.services;

import com.vdab.gamingSite.domain.Company;
import com.vdab.gamingSite.domain.Game;
import com.vdab.gamingSite.repo.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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

    public void save(String name, Company developer, Company publisher, Date releaseDate){
        Game g = new Game(name, developer, publisher, releaseDate);
        gr.save(g);
    }

    public void addImage(File file, Integer id) {

        Game game = gr.findOne(id);
        byte[] picInBytes = new byte[(int) file.length()];
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(picInBytes);
            fileInputStream.close();
            game.setPicture(picInBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        gr.save(game);


    }

    public void save(Game g){
        gr.save(g);
    }


}
