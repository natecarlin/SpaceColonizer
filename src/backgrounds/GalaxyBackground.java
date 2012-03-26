package backgrounds;

import game.Player;
import game.SpaceColonizer;

import java.awt.Color;
import java.awt.Graphics2D;

import sprites.AssetMenuSprite;
import sprites.MenuSprite;
import sprites.PlanetSystem;
import sprites.TurnMenuSprite;

@SuppressWarnings("serial")
public class GalaxyBackground extends SpaceBackground{
	PlanetSystem mySystem1;
	PlanetSystem mySystem2;
	PlanetSystem mySystem3;
	PlanetSystem mySystem4;
	PlanetSystem mySystem5;
	PlanetSystem mySystem6;
	PlanetSystem mySystem7;
	PlanetSystem mySystem8;
	MenuSprite assetsMenu;
	MenuSprite turnMenu;
	

	
	public GalaxyBackground(SpaceColonizer g, Player p){
		super(g,p);
		mySystem1 = new PlanetSystem(550, 400,this, getGame().getPlanets().get(0));
		mySystem2 = new PlanetSystem(350, 450,this, getGame().getPlanets().get(1));
		mySystem3 = new PlanetSystem(650, 300,this, getGame().getPlanets().get(2));
		mySystem4 = new PlanetSystem(450, 300,this, getGame().getPlanets().get(3));
		mySystem5 = new PlanetSystem(320, 150,this, getGame().getPlanets().get(4));
		mySystem6 = new PlanetSystem(650, 520,this, getGame().getPlanets().get(5));
		mySystem7 = new PlanetSystem(430, 190,this, getGame().getPlanets().get(6));
		mySystem8 = new PlanetSystem(575, 130,this, getGame().getPlanets().get(7));
		
		assetsMenu = new AssetMenuSprite(20, 50, "assets", this);
		turnMenu = new TurnMenuSprite(20, 300, "next turn", this);
	}
	
	
	@Override
	public void render(Graphics2D arg){
		super.render(arg);
		arg.setColor(Color.GREEN);
		arg.drawLine(200, 0, 200, 600);
		getFont().drawString(arg, "Galaxy Map", 400, 50);
		getFont().drawString(arg, "net worth:  " + Integer.toString(myPlayer.getNetWorth()), 20, 100);
		getFont().drawString(arg, "projected income per month:  " + Integer.toString(myPlayer.getIncome()), 20, 150);
		getFont().drawString(arg, "capital:  " + Integer.toString(myPlayer.getCapital()), 20, 200);
		getFont().drawString(arg, "month:  " + Integer.toString(myPlayer.getTurn()), 20, 250);
		mySystem1.render(arg);
		mySystem2.render(arg);
		mySystem3.render(arg);
		mySystem4.render(arg);
		mySystem5.render(arg);
		mySystem6.render(arg);
		mySystem7.render(arg);
		mySystem8.render(arg);
		assetsMenu.render(arg);
		turnMenu.render(arg);
	}
	@Override
	public void update(long time){
		mySystem1.update(time);
		mySystem2.update(time);
		mySystem3.update(time);
		mySystem4.update(time);
		mySystem5.update(time);
		mySystem6.update(time);
		mySystem7.update(time);
		mySystem8.update(time);
		assetsMenu.update(time);
		turnMenu.update(time);
	}
}
