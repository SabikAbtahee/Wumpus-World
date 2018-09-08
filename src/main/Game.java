package main;

public class Game {
	
	private int row=10,column=10;
	private Room rooms[][];
	private Agent agent;
	private int gamePoint=0;
	
	
	
	public Game(Room rooms[][], Agent agent,int row,int column) {
		this.row=row;
		this.column=column;
		this.rooms=rooms;
		this.agent=agent;
	}
	
	public void startgame() {
		createBreezeByPit();
		createStenchByWumpus();
	}
	
	public void createBreezeByPit() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {	
				if(rooms[i][j].getPit()==1) {
					setBreezeOnRoom(i,j);
				}
			}	
		}
	}
	
	public void createStenchByWumpus() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {	
				if(rooms[i][j].getWumpus()==1) {
					setStenchOnRoom(i,j,1);
					break;
				}
			}	
		}
	}
	
	public void setBreezeOnRoom(int x,int y) {
		Coordinate corCap[]=getAdjacentRooms(x,y);
		for(int i=0;i<corCap[0].getCount();i++) {
			rooms[corCap[i].getX()][corCap[i].getY()].setBreeze(1);
		}
	}
	
	public void setStenchOnRoom(int x,int y,int stench) {
		Coordinate corCap[]=getAdjacentRooms(x,y);
		for(int i=0;i<corCap[0].getCount();i++) {
			rooms[corCap[i].getX()][corCap[i].getY()].setStench(stench);
		}
	}
	
	public Coordinate[] getAdjacentRooms(int x,int y) {
		Coordinate cor[] = new Coordinate[4];
		int i=0;
		
		if(x+1<row) {
			cor[i]  = new Coordinate(x+1,y);
			i++;
		}
		if(x-1>=0) {
			cor[i]  = new Coordinate(x-1,y);
			i++;
		}
		if(y+1<column) {
			cor[i]  = new Coordinate(x,y+1);
			i++;
		}
		if(y-1>=0) {
			cor[i]  = new Coordinate(x,y-1);
			i++;
		}
		cor[0].setCount(i);
		
		
		return cor;
	}
	
	public void checkWin() {
		Coordinate cor = new Coordinate(-1,-1);
		cor=agent.getCurrentPosition();
		int a=cor.getX();
		int b=cor.getY();
		if(rooms[a][b].getGold()==1) {
			setGamePoint(getGamePoint() + 1000);
		}
	}

	public void checkDeath() {
		Coordinate cor = new Coordinate(-1,-1);
		cor=agent.getCurrentPosition();
		int a=cor.getX();
		int b=cor.getY();
		if(rooms[a][b].getPit()==1 ||rooms[a][b].getWumpus()==1 ) {
			setGamePoint(getGamePoint() - 1000);
		}
	}

	public void WumpusKilled() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {	
				if(rooms[i][j].getWumpus()==1) {
					rooms[i][j].setWumpus(0);
					setStenchOnRoom(i,j,0);
					break;
				}
			}	
		}
	}

	
	public int getGamePoint() {
		return gamePoint;
	}


	public void setGamePoint(int gamePoint) {
		this.gamePoint = gamePoint;
	}
}
