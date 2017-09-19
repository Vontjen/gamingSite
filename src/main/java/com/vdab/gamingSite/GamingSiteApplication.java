package com.vdab.gamingSite;

import com.vdab.gamingSite.services.GameService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GamingSiteApplication {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(GamingSiteApplication.class, args);

		GameService gs= ac.getBean(GameService.class);
	}
}
