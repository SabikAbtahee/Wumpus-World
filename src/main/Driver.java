package main;

public class Driver {
	private int row=10,column=10;
	private Room rooms[][];
	
	
	public Driver() {
		
		this.initialize();
	}
	
	public void initialize() {
		
		rooms=new Room[row][column];
		createBasicRooms();
	}
	
	public void createBasicRooms() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				rooms[i][j]= new Room();
			}
		}
	}
	
}
