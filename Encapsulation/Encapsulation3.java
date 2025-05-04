class Car {
	private String model;
	private int year;

	public Car(String model, int year){
		this.model = model;
		this.year = year;
	}
	public String getModel(){
		return this.model;
	}
}

class Solution {
	public static void main(String[] args) {
		Car car = new Car("Tesla Model X", 2022);
		System.out.println("Model: " + car.getModel());
	}
}