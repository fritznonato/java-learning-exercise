class Car {
	String model;
	String color;
	int year;

	Car(String model, String color, int year) {
		this.model = model;
		this.color = color;
		this.year = year;
	}

	Car(String model, int year){
		this.model = model;
		this.color = "White";
		this.year = year;
	}
}

class Solution {
	public static void main(String[] args) {
		Car myCar = new Car("Sedan", "Red", 2021 );
		System.out.println(myCar.model + " - " + myCar.color + " - " + myCar.year);
		Car anotherCar = new Car("SUV", "Blue", 2023);
		System.out.println(anotherCar.model + " - " + anotherCar.color + " - " + anotherCar).year
	}
}
