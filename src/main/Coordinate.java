package main;

public class Coordinate {
	private int x;
	private int y;
	private int count=0;
	
	public Coordinate(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void setCount(int x) {
		this.count=x;
	}
	public int getCount() {
		return this.count;
	}
}
