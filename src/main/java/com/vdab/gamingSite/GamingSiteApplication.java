package com.vdab.gamingSite;

import com.vdab.gamingSite.domain.Game;
import com.vdab.gamingSite.repo.GameRepository;
import com.vdab.gamingSite.services.GameService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@SpringBootApplication
public class GamingSiteApplication {

    public static void main(String[] args) {

        ApplicationContext ac = SpringApplication.run(GamingSiteApplication.class, args);

        GameRepository gr = ac.getBean(GameRepository.class);
        GameService gs = ac.getBean(GameService.class);

        //todo there has to be a better way
        gs.addImage(new File("nier.jpg"),1000);
        gs.addImage(new File("wolfenstein.jpg"),3000);
        gs.addImage(new File("yakuza.png"),2000);


    }




}

