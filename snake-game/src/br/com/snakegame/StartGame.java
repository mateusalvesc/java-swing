package br.com.snakegame;

import javax.swing.*;

@SuppressWarnings("serial")
public class StartGame extends JFrame {

	public static void main(String[] args) {
		
		new StartGame();
	}
	
	StartGame() {
		add(new GameScreen());
        setTitle("Snake game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
	}
}