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

		Game nier = gr.findOne(1000);
		Game yakuza = gr.findOne(2000);
		Game wolfenstein = gr.findOne(3000);

		//todo there has to be a better way
		File file = new File("nier.jpg");
		byte[] picInBytes = new byte[(int) file.length()];
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(picInBytes);
			fileInputStream.close();
			nier.setPicture(picInBytes);
		} catch (IOException e) {
			e.printStackTrace();
		}

		gr.save(nier);

	}
}
