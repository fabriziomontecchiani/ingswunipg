import robot.custom.DanceCommand;
import robot.custom.GoToLocationCommand;
import robot.model.AudioBoard;
import robot.model.LightBoard;
import robot.model.Robot;

public class Test {

	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.attachBoard(new AudioBoard());
		robot.attachBoard(new LightBoard());
		System.out.println(robot.toString());
		
		robot.run(new DanceCommand());
		System.out.println(robot.toString());
		
		robot.run(new GoToLocationCommand(5,-10));
		System.out.println(robot.toString());
		
		robot.run(new GoToLocationCommand(0,0));
		System.out.println(robot.toString());
	}

}
