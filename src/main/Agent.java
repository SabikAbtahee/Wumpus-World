package main;

public class Agent {
	Coordinate cor;
	private String direction;
	private int arrow=1;
	private int cost=0;
	private int row,column;
	
	public Agent(int row,int column) {
		cor= new Coordinate(0,0);
		this.row=row;
		this.column=column;
	}
	public void setCurrentPosition(int x,int y) {
		cor.setX(x);
		cor.setY(y);
	}
	
	
	public Coordinate getCurrentPosition() {
		return cor;
	}
	
	public void turnRight() {
		if(direction.equals("up")) {
			direction="right";
		}
		if(direction.equals("right")) {
			direction="down";
		}
		if(direction.equals("down")) {
			direction="left";
		}
		if(direction.equals("left")) {
			direction="up";
		}
		cost++;
	}
	
	public void turnLeft() {
		if(direction.equals("up")) {
			direction="left";
		}
		if(direction.equals("right")) {
			direction="up";
		}
		if(direction.equals("down")) {
			direction="right";
		}
		if(direction.equals("left")) {
			direction="down";
		}
		cost++;
	}
	
	public void moveForward() {
		int curX=cor.getX();
		int curY=cor.getY();
		
		boolean validMove=false;
		
		if(direction.equals("up")) {
			if(curX+1>=row) {
				validMove=false;
			}
			else {
				cor.setX(curX+1);
				validMove=true;
			}
		}
		else if(direction.equals("down")) {
			if(curX-1<0) {
				validMove=false;
			}
			else {
				cor.setX(curX-1);
				validMove=true;
			}
		}
		else if(direction.equals("left")) {
			if(curY-1<0) {
				validMove=false;
			}
			else {
				cor.setY(curY-1);
				validMove=true;
			}
		}
		else if(direction.equals("right")) {
			if(curY+1>=column) {
				validMove=false;
			}
			else {
				cor.setY(curY+1);
				validMove=true;
			}
		}
		
		
	
		if(validMove) {
			cost++;
		}
	}
	
	public int getCost() {
		return cost;
	}
	public void increaseCost(int x) {
		cost+=x;
	}
	
	public void Shoot() {
		
	}
	
}
