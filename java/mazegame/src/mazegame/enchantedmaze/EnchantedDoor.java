package mazegame.enchantedmaze;

import java.util.Random;

import mazegame.maze.Door;
import mazegame.maze.Room;

public class EnchantedDoor extends Door {

	public EnchantedDoor(Room roomA, Room roomB) {
		super(roomA, roomB);
	}

	@Override
	public void enter() {
		Random r = new Random();
		boolean b = r.nextBoolean();
		setOpen(b);
		super.enter();
	}

}
