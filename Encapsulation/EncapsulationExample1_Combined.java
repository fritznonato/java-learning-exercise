public class MyRobot {
	private String robotName;

	public String getRobotName(){
		return this.robotName;
	}

	public boid setRobotName(String newRobotName){
		this.robotName = newRobotName;
	}
}

MyRobot robot = new MyRobot();
robot.setRobotName("Bot-202");
System.out.println(robot.getRobotName());