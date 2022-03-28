package com.adonay.firstspring.game;

public class SuperContraGame implements GammingConsole {

		@Override
		public void up() {
			System.out.println("upS");
		}
		
		@Override
		public void down() {
			System.out.println("downS");
		}
		
		@Override
		public void left() {
			System.out.println("leftS");
		}
		
		@Override
		public void right() {
			System.out.println("rightS");
		}
	}
