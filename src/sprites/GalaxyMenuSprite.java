package sprites;

import backgrounds.SpaceBackground;

@SuppressWarnings("serial")
public class GalaxyMenuSprite extends MenuSprite{

	public GalaxyMenuSprite(int x, int y, String menu, SpaceBackground current) {
		super(x, y, menu, current);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction() {
		myBackground.getGame().goToGalaxyBackground();
		
	}

}
