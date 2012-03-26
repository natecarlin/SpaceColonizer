package assets;

import game.Planet;

public class ScientificModule extends Asset{

	public ScientificModule(Planet planet) {
		super(5000, planet);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		return "scientific module";
	}

	@Override
	public int getReturn() {
		return myPlanet.getScientificScore();
	}

}
