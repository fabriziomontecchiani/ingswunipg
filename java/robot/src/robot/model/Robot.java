package robot.model;

import java.util.HashSet;
import java.util.Set;

public class Robot {
	private int x; // positive x is right
	private int y; // positive y is up
	
	/*
	 * Direction that the robot's body is facing, in degrees (0 <= heading < 360). 
	 * 0 means up, 90 means right, 180 means south, and 270 means left.
	 */
	private int heading; 
	
	private Set<Board> boards;

	public Robot() {
		this.x = 0;
		this.y = 0;
		this.heading = 0;
		this.boards = new HashSet<Board>();
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public int getHeading() {
		return this.heading;
	}
	
	public void moveForward(int displacement) {
		switch(this.heading) {
		case 0:
			this.y += displacement;
			break;
		case 90:
			this.x += displacement;
			break;
		case 180:
			this.y -= displacement;
			break;
		case 270:
			this.x -= displacement;
			break;
		}
		
	}
	
	public void moveBackward(int displacement) {
		moveForward(-displacement);
	}
	
	public void rotateClockwiseBy90() {
		int newAngle = this.heading + 90;
		this.heading = newAngle % 360;
	}
	
	public void rotateCounterClockwiseBy90() {
		int newAngle = this.heading + 270;
		this.heading = newAngle % 360;
	}
	
	public void run(Command c) {
		this.notifyBoards();
		c.execute(this);
	}
	
	public void attachBoard(Board board) {
		this.boards.add(board);
	}
	
	public void removeBoard(Board board) {
		this.boards.remove(board);
	}
	
	protected void notifyBoards() {
		for(Board b:boards) {
			b.update();
		}
	}
	
	public String toString() {
		return "X: "+this.getX()+" Y: "+this.getY()+" H: "+this.getHeading();
	}
}
