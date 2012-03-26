package game;

import java.util.ArrayList;
import java.util.List;

import assets.Asset;
import assets.IndustrialModule;
import assets.ResidentialModule;
import assets.Scan;
import assets.ScientificModule;

public class Planet {
	String myName;
	int myResidential;
	int myIndustrial;
	int myScientific;
	List<Asset> Assets;
	List<Asset> boughtAssets;
	Asset myResMod;
	Asset myIndMod;
	Asset mySciMod;
	Asset myScan;
	
	public Planet(String name, int res, int ind, int sci){
		myName = name;
		myResidential = res;
		myIndustrial = ind;
		myScientific = sci;
		Assets = new ArrayList<Asset>();
		boughtAssets = new ArrayList<Asset>();
		myResMod = new ResidentialModule(this);
		myIndMod = new IndustrialModule(this);
		mySciMod = new ScientificModule(this);
		myScan = new Scan(this);
		
		Assets.add(myResMod);
		Assets.add(myIndMod);
		Assets.add(mySciMod);
		Assets.add(myScan);
	}
	
	public String getName(){
		return myName;
	}
	
	public int getResidentialScore(){
		return myResidential;
	}
	
	public int getIndustrialScore(){
		return myIndustrial;
	}
	
	public int getScientificScore(){
		return myScientific;
	}
	
	public List<Asset> getAssets(){
		return Assets;
	}
	
	public List<Asset> getBought(){
		return boughtAssets;
	}
	
	public Asset getResAsset(){
		return myResMod;
	}
	
	public Asset getIndAsset(){
		return myIndMod;
	}
	public Asset getSciAsset(){
		return mySciMod;
	}
	
	public Asset getScan(){
		return myScan;
	}
	
	public boolean scanned(){
		return !myScan.getAvailable();
	}
}
