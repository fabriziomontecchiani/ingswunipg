package mazegame.maze;

public class Door implements MapSite {
	
	private boolean open;
	private Room roomA, roomB;

	public Door(Room roomA, Room roomB) {
		open = false;
		this.roomA = roomA;
		this.roomB = roomB;
	};

	public void enter() {
		String msg = isOpen() ? "The door is open" : "The door is closed!";
		System.out.println(msg);
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean o) {
		this.open = o;
	}

	public Room otherRoom(Room currentRoom) {
		if (currentRoom == roomA)
			return roomB;
		if (currentRoom == roomB)
			return roomA;
		throw new IllegalArgumentException("Invalid room.");
	}
}
