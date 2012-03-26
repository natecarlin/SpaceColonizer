package backgrounds;

import game.Player;
import game.SpaceColonizer;

import java.awt.Color;
import java.awt.Font;
import com.golden.gamedev.object.GameFont;
import com.golden.gamedev.object.GameFontManager;
import com.golden.gamedev.object.background.ColorBackground;
import com.golden.gamedev.util.FontUtil;

@SuppressWarnings("serial")
abstract public class SpaceBackground extends ColorBackground{
	GameFont myFont;
	GameFontManager myManager;
	SpaceColonizer myGame;
	Player myPlayer;
	
	SpaceBackground(SpaceColonizer g, Player p){
		super(Color.BLACK, 800,600);
		myGame = g;
		myPlayer = p;
		myManager = new GameFontManager();
		myFont = myManager.getFont(FontUtil.createBitmapFont(new Font("Serif", Font.PLAIN, 12), Color.GREEN));
	}
	
	public GameFont getFont(){
		return myFont;
	}
	
	public SpaceColonizer getGame(){
		return myGame;
	}
	
	public  Player getPlayer(){
		return myPlayer;
	}

}
