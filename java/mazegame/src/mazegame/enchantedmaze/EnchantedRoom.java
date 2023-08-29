package mazegame.enchantedmaze;

import mazegame.maze.Room;

public class EnchantedRoom extends Room{

	public EnchantedRoom(int num) {
		super(num);
	}
	
	@Override
	public void enter() {
		super.enter();
		System.out.println("You are in an enchanted room!");
	}

}
