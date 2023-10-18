package robot.custom;

import robot.model.Command;
import robot.model.Robot;

public class GoToLocationCommand implements Command {

	private int x;
	private int y;

	public GoToLocationCommand(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void execute(Robot robot) {
		int rX = robot.getX();
		int rY = robot.getY();
		int rA = robot.getHeading();

		switch (rA) {
		case 90:
			robot.rotateCounterClockwiseBy90();
			break;
		case 180:
			robot.rotateCounterClockwiseBy90();
			robot.rotateCounterClockwiseBy90();
			break;
		case 270:
			robot.rotateClockwiseBy90();
			break;
		}

		int displacementY = this.y - rY;
		if (displacementY > 0) {
			robot.moveForward(displacementY);
		} else {
			robot.moveBackward(Math.abs(displacementY));
		}
		int displacementX = this.x - rX;
		if (displacementX > 0) {
			robot.rotateClockwiseBy90();
		} else {
			robot.rotateCounterClockwiseBy90();
		}
		robot.moveForward(Math.abs(displacementX));
	}

}
