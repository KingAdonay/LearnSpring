package com.adonay.firstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.adonay.firstspring.game.GameRunner;
import com.adonay.firstspring.game.GammingConsole;
import com.adonay.firstspring.game.MarioGame;
import com.adonay.firstspring.game.SuperContraGame;

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(FirstSpringApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		
		//GammingConsole game = new SuperContraGame();
		//GameRunner runner = new GameRunner(game);
		
		runner.runGame();
	}

}
