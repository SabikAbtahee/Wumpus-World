package main;

public class Room {
	private int breeze=0;
	private int stench=0;
	private int pit=0;
	private int wumpus=0;
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
	
	
}
