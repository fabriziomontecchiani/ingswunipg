package robot.model;

public class AudioBoard implements Board {

	public void update() {
		this.play("AUDIO BOARD: NEW COMMAND RECEIVED");
	}

	public void play(String message) {
		System.out.println(message);
	}

}
