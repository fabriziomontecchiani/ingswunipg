package mazegame.maze;

import java.util.HashMap;
import java.util.Map;

public class Room implements MapSite {

	private int number;

	private Map<Side, MapSite> sides;

	public Room(int num) {
		number = num;
		sides = new HashMap<Side, MapSite>();
	}

	public int getNumber() {
		return number;
	}

	public MapSite getSide(Side s) {
		return sides.get(s);
	}

	public void setSide(Side s, MapSite ms) {
		sides.put(s, ms);
	}

	public void enter() {
		System.out.println("You entered room number " + getNumber());
	}

}
