package backgrounds;

import game.Planet;
import game.Player;
import game.SpaceColonizer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import sprites.BuyMenuSprite;
import sprites.GalaxyMenuSprite;

@SuppressWarnings("serial")
public class PlanetBackground extends SpaceBackground{
	Planet myPlanet;
	GalaxyMenuSprite myGalaxyMenu;
	BuyMenuSprite myResSprite;
	BuyMenuSprite myIndSprite;
	BuyMenuSprite mySciSprite;
	BuyMenuSprite myScanSprite;
	List<BuyMenuSprite> mySprites;
	
	
	public PlanetBackground(SpaceColonizer g, Player p, Planet plan){
		super(g, p);
		myPlanet = plan;
		myGalaxyMenu = new GalaxyMenuSprite(700, 500, "galaxy map", this);
		mySprites = new ArrayList<BuyMenuSprite>();
		myResSprite = new BuyMenuSprite(175, 120, this, myPlanet.getResAsset());
		mySprites.add(myResSprite);
		myIndSprite = new BuyMenuSprite(175, 140, this, myPlanet.getIndAsset());
		mySprites.add(myIndSprite);
		mySciSprite = new BuyMenuSprite(175, 160, this, myPlanet.getSciAsset());
		mySprites.add(mySciSprite);
		myScanSprite = new BuyMenuSprite(175, 180, this, myPlanet.getScan());
		mySprites.add(myScanSprite);
	}
	
	@Override
	public void render(Graphics2D g){
		super.render(g);
		getFont().drawString(g, myPlanet.getName(), 400, 25);
		g.setColor(Color.WHITE);
		g.drawOval(475, 100, 150, 150);
		if(myPlanet.scanned()){
		getFont().drawString(g, "Residential score: " + Integer.toString(myPlanet.getResidentialScore()), 425, 325);
		getFont().drawString(g, "Industrial score: " + Integer.toString(myPlanet.getIndustrialScore()), 425, 350);
		getFont().drawString(g, "Scientific score: " + Integer.toString(myPlanet.getScientificScore()), 425, 375);
		}
		g.setColor(Color.GREEN);
		g.drawLine(410, 50, 410, 600);
		g.drawLine(410, 300, 800, 300);
		
		getFont().drawString(g, "available capital: " + Integer.toString(myPlayer.getCapital()), 20, 30);
		getFont().drawString(g, "available assets and price:", 20, 80);
		for(int i =0; i < myPlanet.getAssets().size(); i++){
			if(myPlanet.getAssets().get(i).getAvailable()){
			getFont().drawString(g, myPlanet.getAssets().get(i).getType(), 20, 120 + (20 * i));
			getFont().drawString(g, Integer.toString(myPlanet.getAssets().get(i).getVal()), 120, 120 + (20 * i));
			if(myPlayer.canBuy(myPlanet.getAssets().get(i).getVal())){
			mySprites.get(i).render(g);
			}
			}
			
		}
		
		getFont().drawString(g, "owned assets and return value:", 20, 300);

		for(int i =0; i < myPlanet.getBought().size(); i++){
			getFont().drawString(g, myPlanet.getBought().get(i).getType(), 20, 320 + (20 * i));
			getFont().drawString(g, Integer.toString(myPlanet.getBought().get(i).getReturn()), 120, 320 + (20 * i));
		}
		
		
		myGalaxyMenu.render(g);
	}
	
	@Override
	public void update(long time){
		myGalaxyMenu.update(time);
		myResSprite.update(time);
		myIndSprite.update(time);
		mySciSprite.update(time);
	}
	
	public Planet getPlanet(){
		return myPlanet;
	}

}
