public class CellPhone {
	// A method in parent class
	public void displayBatteryStatus(){
		System.out.println("Battery status display with an icon.");
	}
}

public class Smartphone extends CellPhone {
	// Method overridden in child class
	@Override
	public void displayBatteryStatus(){
		System.out.println("Batter status displayed as a percentage.")
	}
}