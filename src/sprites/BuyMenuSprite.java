package sprites;

import assets.Asset;
import backgrounds.PlanetBackground;

@SuppressWarnings("serial")
public class BuyMenuSprite extends MenuSprite{
	Asset myAsset;

	public BuyMenuSprite(int x, int y, PlanetBackground current, Asset asset) {
		super(x, y, "buy", current);
		myAsset = asset;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction() {
		if(myAsset.getAvailable()){
		myBackground.getPlayer().addAsset(myAsset);
		myBackground.getPlayer().removeCapital(myAsset.getVal());
		
		myAsset.getPlanet().getBought().add(myAsset);
		myAsset.bought();
		}
		
	}
	
	public Asset getAsset(){
		return myAsset;
	}

}
