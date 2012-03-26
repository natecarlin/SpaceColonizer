package sprites;

import backgrounds.SpaceBackground;

@SuppressWarnings("serial")
public class AssetMenuSprite extends MenuSprite{

	public AssetMenuSprite(int x, int y, String menu, SpaceBackground current) {
		super(x, y, menu, current);
		
	}

	@Override
	public void doAction() {
		myBackground.getGame().goToAssetsBackground();
		
	}
	
}
