package robot.custom;

import robot.model.Command;
import robot.model.Robot;

public class DanceCommand implements Command {

	@Override
	public void execute(Robot robot) {
		for (int i = 0; i < 10; i++) {
			double next = Math.random();
			if (next < 0.2) {
				robot.moveForward(4);
			} else if (next < 0.4) {
				robot.moveBackward(1);
			} else if (next < 0.6) {
				robot.rotateClockwiseBy90();
			} else if (next < 0.8) {
				robot.rotateCounterClockwiseBy90();
			}
		}
	}
}
