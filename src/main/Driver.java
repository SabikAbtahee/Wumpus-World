package main;

public class Driver {
	private int row=4,column=4;
	private Room rooms[][];
	private Agent agent;
	private Game game;
	
	public Driver() {
		
		this.initialize();
	}
	
	public void initialize() {
		
		createBasicRooms();
		createAgent();
		
		//Create Rules and random rooms
		createMap();
		startGame();
	}
	
	public void createBasicRooms() {
		rooms=new Room[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				rooms[i][j]= new Room();
			}
		}
	}
	
	public void createAgent() {
		agent = new Agent(row,column);
	}
	
	public void startGame() {
		game= new Game(rooms,agent,row,column);
		game.startgame();
		showMap();
	}
	
	
	
	///////////////////RANDOMIZE THIS ////////////////////////
	public void createMap() {
		rooms[2][0].setPit(1);
		rooms[2][2].setPit(1);
		rooms[1][2].setGold(1);
		rooms[0][2].setWumpus(1);
	}
	
	////////////////////////////////////////////////////////
	public void showMap() {
		//String s1 = String.format("%-25s : %25s%n", "left justified", "right justified");
		//System.out.printf(s1);
			for(int j=column-1;j>=0;j--) {
			
				for(int i=0;i<row;i++) {
					String s= rooms[i][j].checkRoom();
					String s1 = String.format("%-25s", s);
					System.out.print(s1);
					
				}
				System.out.println("\n");
				
			}
	}
	
	
}
