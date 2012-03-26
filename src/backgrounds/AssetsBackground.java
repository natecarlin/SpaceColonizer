package backgrounds;

import game.Player;
import game.SpaceColonizer;

import java.awt.Color;
import java.awt.Graphics2D;

import sprites.GalaxyMenuSprite;

@SuppressWarnings("serial")
public class AssetsBackground extends SpaceBackground{
	GalaxyMenuSprite myGalaxyMenu;
	
	public AssetsBackground(SpaceColonizer g, Player p){
		super(g, p);
		myGalaxyMenu = new GalaxyMenuSprite(700, 500, "galaxy map", this);
	}
	
	@Override
	public void render(Graphics2D arg){
		super.render(arg);
		arg.setColor(Color.GREEN);
		getFont().drawString(arg, "Assets", 400, 50);
		getFont().drawString(arg, "Type", 20, 75);
		getFont().drawString(arg, "Planet", 120, 75);
		getFont().drawString(arg, "Price", 220, 75);
		getFont().drawString(arg, "Return", 320, 75);
		
		for(int i = 0; i < myPlayer.getAssets().size(); i++){
			getFont().drawString(arg, myPlayer.getAssets().get(i).getType(), 20, 100 + (20 * i));
			getFont().drawString(arg, myPlayer.getAssets().get(i).getPlanet().getName(), 120, 100 + (20 * i));
			getFont().drawString(arg, Integer.toString(myPlayer.getAssets().get(i).getVal()), 220, 100 + (20 * i));
			getFont().drawString(arg, Integer.toString(myPlayer.getAssets().get(i).getReturn()), 320, 100 + (20 * i));
			
		}
		myGalaxyMenu.render(arg);
	}
	
	@Override
	public void update(long time){
		myGalaxyMenu.update(time);
	}

}
