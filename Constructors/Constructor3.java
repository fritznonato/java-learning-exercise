class Car {
	String model;
	int year;

	Car(String model, int year){
		this.model = model
		this.year = year;
	}
}

class Solution {
	public static void main(String[] args){
		Car myCar = new Car("Toyota Camry", 2021);

		System.out.println("Model: " + myCar.model + " - Year: " + myCar.year);
	}
}