package sprites;

import java.awt.Color;
import java.awt.Graphics2D;

import backgrounds.SpaceBackground;

import com.golden.gamedev.object.Sprite;

@SuppressWarnings("serial")
public abstract class MenuSprite extends Sprite{
	String myMenu;
	SpaceBackground myBackground;
	int myX;
	int myY;
	
	public MenuSprite(int x, int y, String menu, SpaceBackground current){
		super(x,y);
		myX = x;
		myY = y;
		myMenu = menu;
		myBackground = current;
		this.setBackground(myBackground);
	}
	
	@Override
	public void render(Graphics2D g){
		myBackground.getFont().drawString(g, myMenu, myX, myY);
		if(mouseInRegion()){
			g.setColor(Color.RED);
			g.drawRect(myX, myY,75, 20);
		
			if(myBackground.getGame().clicked()){
				doAction();
			}
		}
	}
	
	public boolean mouseInRegion(){
		return(myBackground.getGame().getMouseX() >= myX && myBackground.getGame().getMouseX() <= myX + 75 
				&& myBackground.getGame().getMouseY() >= myY && myBackground.getGame().getMouseY() <= myY + 20);
	}
	
	public abstract void doAction();
		
	

}
