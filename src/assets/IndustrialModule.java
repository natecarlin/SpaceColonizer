package assets;

import game.Planet;

public class IndustrialModule extends Asset{

	public IndustrialModule(Planet planet) {
		super(2000, planet);
	}

	@Override
	public int getReturn() {
		return myPlanet.getIndustrialScore();
	}

	@Override
	public String getType() {
		
		return "industrial module";
	}

}
