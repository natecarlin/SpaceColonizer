package game;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import backgrounds.AssetsBackground;
import backgrounds.GalaxyBackground;
import backgrounds.PlanetBackground;
import backgrounds.SpaceBackground;

import com.golden.gamedev.Game;
import com.golden.gamedev.object.Background;
import com.golden.gamedev.object.Timer;

public class SpaceColonizer extends Game{
	GalaxyBackground myGalaxy;
	AssetsBackground myAssets;
	Background myCurrentBackground;
	Timer myTimer;
	boolean clicker;
	Player myPlayer;
	List<PlanetBackground> myPlanetsBackground;
	List<Planet> myPlanets;
	Planet planet1;
	Planet planet2;
	Planet planet3;
	Planet planet4;
	Planet planet5;
	Planet planet6;
	Planet planet7;
	Planet planet8;
	
	
	@Override
	public void initResources() {
		myPlayer = new Player();
		myPlanetsBackground = new ArrayList <PlanetBackground>();
		myPlanets = new ArrayList<Planet>();
		planet1 = new Planet("Rigel", 125, 50 ,100);
		myPlanets.add(planet1);
		myPlanetsBackground.add(new PlanetBackground(this, myPlayer, planet1));
		planet2 = new Planet("Betelgeuse", 50, 1000 ,250);
		myPlanets.add(planet2);
		myPlanetsBackground.add(new PlanetBackground(this, myPlayer, planet2));
		planet3 = new Planet("Altair", 50, 50 ,50);
		myPlanets.add(planet3);
		myPlanetsBackground.add(new PlanetBackground(this, myPlayer, planet3));
		planet4 = new Planet("Zebulon", 25, 500 ,100);
		myPlanets.add(planet4);
		myPlanetsBackground.add(new PlanetBackground(this, myPlayer, planet4));
		planet5 = new Planet("Arrakis", 5, 25 ,800);
		myPlanets.add(planet5);
		myPlanetsBackground.add(new PlanetBackground(this, myPlayer, planet5));
		planet6 = new Planet("Terminus", 20, 100 ,600);
		myPlanets.add(planet6);
		myPlanetsBackground.add(new PlanetBackground(this, myPlayer, planet6));
		planet7 = new Planet("Kashyyk", 100, 200 ,300);
		myPlanets.add(planet7);
		myPlanetsBackground.add(new PlanetBackground(this, myPlayer, planet7));
		planet8 = new Planet("Arcturus", 75, 400 ,100);
		myPlanets.add(planet8);
		myPlanetsBackground.add(new PlanetBackground(this, myPlayer, planet8));

		
		myGalaxy = new GalaxyBackground(this, myPlayer);
		myAssets = new AssetsBackground(this, myPlayer);
		myCurrentBackground = myGalaxy;
		myTimer = new Timer(200);
		clicker = false;
		
	}

	@Override
	public void render(Graphics2D arg0) {
		myCurrentBackground.render(arg0);
		
	}

	@Override
	public void update(long arg0) {
		clicker = click();
		if(myTimer.action(arg0)){
			myCurrentBackground.update(arg0);
			clicker = false;
		}
		
	}
	
	public boolean clicked(){
		return clicker;
	}
	
	public SpaceBackground getAssetsBackground(){
		return myAssets;
	}
	
	public void goToAssetsBackground(){
		myCurrentBackground = myAssets;
	}
	
	public void goToGalaxyBackground(){
		myCurrentBackground = myGalaxy;
	}
	
	public List<Planet> getPlanets(){
		return myPlanets;
	}
	
	public void goToPlanetBackground(String planname){
		for(PlanetBackground p: myPlanetsBackground){
			if(p.getPlanet().getName() == planname){
				myCurrentBackground = p;
				break;
			}
		}
	}

}
