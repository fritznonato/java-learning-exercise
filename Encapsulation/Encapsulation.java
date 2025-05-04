class Vehicle {
	private String engineStatus = "off";

	public String getEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(String status) {
		this.engineStatus = status;
	}
}

class Solution {
	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		car.setEngineStatus("on");
		System.out.println("The engine is " + car.getEngineStatus());
	}
}