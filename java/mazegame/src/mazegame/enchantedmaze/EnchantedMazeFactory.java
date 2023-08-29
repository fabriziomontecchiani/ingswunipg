package mazegame.enchantedmaze;

import mazegame.maze.AbstractMazeFactory;
import mazegame.maze.Door;
import mazegame.maze.Maze;
import mazegame.maze.Room;
import mazegame.maze.Wall;

public class EnchantedMazeFactory extends AbstractMazeFactory {
	
	@Override
	public Maze createMaze() {
		return new EnchantedMaze();
	}

	@Override
	public Room createRoom() {
		return new EnchantedRoom(nextRoomNumber());
	}

	@Override
	public Wall createWall() {
		return new EnchantedWall();
	}

	@Override
	public Door createDoor(Room roomA, Room roomB) {
		return new EnchantedDoor(roomA, roomB);
	}

}
