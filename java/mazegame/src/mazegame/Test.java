package mazegame;

import mazegame.configuration.Configuration;
import mazegame.maze.Door;
import mazegame.maze.Maze;
import mazegame.maze.MazeFactory;
import mazegame.maze.Room;
import mazegame.maze.Side;

public class Test {

	public static void main(String[] args) {
		MazeFactory factory = Configuration.getInstance().getMazeFactory();
		Maze maze = factory.createMaze();
		Room ra = factory.createRoom();
		Room rb = factory.createRoom();
		maze.addRoom(ra);
		maze.addRoom(rb);

		Door d = factory.createDoor(ra, rb);
		ra.setSide(Side.NORTH, factory.createWall());
		ra.setSide(Side.SOUTH, factory.createWall());
		ra.setSide(Side.EAST, factory.createWall());
		ra.setSide(Side.WEST, d);

		rb.setSide(Side.NORTH, factory.createWall());
		rb.setSide(Side.SOUTH, factory.createWall());
		rb.setSide(Side.EAST, d);
		rb.setSide(Side.WEST, factory.createWall());

		ra.enter();
		ra.getSide(Side.NORTH).enter();
		ra.getSide(Side.WEST).enter();
		ra.getSide(Side.WEST).enter();
		ra.getSide(Side.WEST).enter();
	}

}
