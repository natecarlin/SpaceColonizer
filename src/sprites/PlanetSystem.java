package sprites;

import game.Planet;

import java.awt.Color;
import java.awt.Graphics2D;

import backgrounds.GalaxyBackground;

import com.golden.gamedev.object.Sprite;

@SuppressWarnings("serial")
public class PlanetSystem extends Sprite{
	int myX;
	int myY;
	GalaxyBackground myBack;
	Planet myPlanet;
	
	public PlanetSystem(int x, int y, GalaxyBackground g, Planet planet){
		super(x,y);
		myX =x;
		myY =y;
		myBack = g;
		this.setBackground(myBack);
		myPlanet = planet;
	}
	
	@Override
	public void render(Graphics2D g){
		
		g.setColor(Color.WHITE);
		g.fillOval(myX,myY, 4, 4);
		if(mouseInRegion()){
			g.setColor(Color.RED);
			g.drawOval(myX, myY, 8, 8);
			myBack.getFont().drawString(g, myPlanet.getName(), myX + 10, myY);
			if(myBack.getGame().clicked()){
				myBack.getGame().goToPlanetBackground(myPlanet.getName());
			}
		}
		super.render(g);
	}
	
	public boolean mouseInRegion(){
		return Math.abs(myBack.getGame().getMouseX()-myX)<8 && Math.abs(myBack.getGame().getMouseY()- myY)<8;
	}

}
