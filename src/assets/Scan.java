package assets;

import game.Planet;

public class Scan extends Asset{

	public Scan(Planet planet) {
		super(100, planet);
		
	}

	@Override
	public int getReturn() {
		return 0;
	}

	@Override
	public String getType() {
		return "scan";
	}

}
