class Car {
	void startEngine() {
		System.out.println("Vroom! The car engine starts.");
	}
	void stopEngine() {
		System.out.println("Stopping the engine");
	}
}

class Solution {
	public static void main(String[] args){
		Car car = new Car();
		car.startEngine();
		car.stopEngine();
	}
}