package robot.model;

public class LightBoard implements Board {

	public void update() {
		this.blinkLight();
	}

	public void blinkLight() {
		System.out.println("LIGHT BOARD: BLINKING");
	}

}
