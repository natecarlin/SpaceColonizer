package game;

import java.util.ArrayList;
import java.util.List;

import assets.Asset;

public class Player {
	ArrayList <Asset> myAssets;
	int turncounter;
	int myCapital;
	
	Player(){
		myAssets = new ArrayList<Asset>();
		turncounter = 0;
		myCapital = 1000;
	}
	
	public void incrementTurn(){
		myCapital += getIncome();
		turncounter++;
	}
	
	public int getNetWorth(){
		int worth = 0;
		for(Asset a : myAssets){
			worth+= a.getVal();
		}
		worth += myCapital;
		return worth;
	}
	
	public int getIncome(){
		int income = 0;
		for(Asset a : myAssets){
			income += a.getReturn();
		}
		return income;
	}
	
	public int getCapital(){
		return myCapital;
	}
	
	public int getTurn(){
		return turncounter;
	}
	
	public List<Asset> getAssets(){
		return myAssets;
	}
	
	public void addAsset(Asset a){
		myAssets.add(a);
	}
	
	public void removeCapital(int remove){
		myCapital -= remove;
	}
	
	public boolean canBuy(int price){
		return(myCapital - price >= 0);
	}

}
