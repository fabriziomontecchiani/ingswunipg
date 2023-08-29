package mazegame.maze;

import java.util.HashMap;
import java.util.Map;

public class Maze {
	
	private Map<Integer, Room> rooms;

	public Maze() {
		rooms = new HashMap<Integer, Room>();
	}

	public void addRoom(Room r) {
		if (!rooms.containsKey(r.getNumber()))
			rooms.put(r.getNumber(), r);
		else
			throw new IllegalArgumentException("Room number already added");
	}

	public Room getRoom(int num) {
		return rooms.get(num);
	}
}
