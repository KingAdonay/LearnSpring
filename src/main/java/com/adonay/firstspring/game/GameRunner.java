package com.adonay.firstspring.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	@Autowired
	private GammingConsole game;

	public GameRunner(GammingConsole game) {
		this.game=game;
	}

	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
