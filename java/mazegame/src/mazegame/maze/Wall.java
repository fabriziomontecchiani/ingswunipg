package mazegame.maze;

public class Wall implements MapSite {

	public void enter() {
		System.out.println("You cannot enter a wall!");
	}

}
