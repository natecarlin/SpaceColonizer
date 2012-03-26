package assets;

import game.Planet;

public class ResidentialModule extends Asset{

	public ResidentialModule(Planet planet) {
		super(500, planet);
		
	}

	@Override
	public int getReturn() {
		return myPlanet.getResidentialScore();
	}

	@Override
	public String getType() {
		return "residential module";
	}

}
