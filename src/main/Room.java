package main;

public class Room {
	private int breeze=0;
	private int stench=0;
	private int pit=0;
	private int wumpus=0;
	private int gold=0;
	

	private boolean safe=false;
	
	public void setBreeze(int b) {
		this.breeze=b;
	}
	
	public void setStench(int s) {
		this.stench=s;
	}
	
	public void setPit(int p) {
		this.pit=p;
	}
	
	public void setWumpus(int w) {
		this.wumpus=w;
	}
	
	public void checkSafe() {
		if(this.pit==-1 && this.wumpus==-1) {
			this.safe=true;
		}
	}

	public boolean isSafe() {
		return safe;
	}

	

	public int getBreeze() {
		return breeze;
	}

	public int getStench() {
		return stench;
	}

	public int getPit() {
		return pit;
	}

	public int getWumpus() {
		return wumpus;
	}
	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public String checkRoom() {
		String product="";
		if(breeze==1) {
			product+="brez ";
		}
		if(pit==1) {
			product+="pit ";
		}
		if(gold==1) {
			product+="gold ";
		}
		if(wumpus==1) {
			product+="wump ";
		}
		if(stench==1) {
			product+="sten ";
		}
		if(product.equals("")) {
			product+="C";
		}
		return product;
		
	} 
	
	
	
	
	
	
}
