package com.vdab.gamingSite;

import com.vdab.gamingSite.services.GameService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GamingSiteApplication {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(GamingSiteApplication.class, args);


	}
}
