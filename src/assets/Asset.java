package assets;

import game.Planet;

public abstract class Asset {
	int myValue;
	Planet myPlanet;
	boolean available;
	
	Asset(int value, Planet planet){
		myValue = value;
		myPlanet = planet;
		available = true;
	}
	
	public int getVal(){
		return myValue;
	}
	
	public abstract int getReturn();
	
	public Planet getPlanet(){
		return myPlanet;
	}
	
	public abstract String getType();
	
	public boolean getAvailable(){
		return available;
	}
	
	public void bought(){
		available = false;
	}

}
