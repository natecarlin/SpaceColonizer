package sprites;

import backgrounds.SpaceBackground;

@SuppressWarnings("serial")
public class TurnMenuSprite extends MenuSprite{

	public TurnMenuSprite(int x, int y, String menu, SpaceBackground current) {
		super(x, y, menu, current);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction() {
		myBackground.getPlayer().incrementTurn();
		
	}

}
