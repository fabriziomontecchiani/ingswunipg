package mazegame.maze;

public class SimpleMazeFactory extends AbstractMazeFactory {
	
	@Override
	public Maze createMaze() {
		return new Maze();
	}

	@Override
	public Room createRoom() {
		return new Room(nextRoomNumber());
	}

	@Override
	public Wall createWall() {
		return new Wall();
	}

	@Override
	public Door createDoor(Room roomA, Room roomB) {
		return new Door(roomA, roomB);
	}

}
