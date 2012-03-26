package main;

import game.SpaceColonizer;

import java.awt.Dimension;

import com.golden.gamedev.GameLoader;

public class Main {
	public static void main(String [] args){
		GameLoader loader = new GameLoader();
		loader.setup(new SpaceColonizer(), new Dimension(800,600), false);
		loader.start();
	}
}
