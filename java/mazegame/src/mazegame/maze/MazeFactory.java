package mazegame.maze;

public interface MazeFactory {
	
	Maze createMaze();

	Room createRoom();

	Wall createWall();

	Door createDoor(Room roomA, Room roomB);
}
