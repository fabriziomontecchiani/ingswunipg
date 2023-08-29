package mazegame.maze;

public abstract class AbstractMazeFactory implements MazeFactory {

	private int lastRoomNumber = 0;

	protected int nextRoomNumber() {
		return ++lastRoomNumber;
	}
}
