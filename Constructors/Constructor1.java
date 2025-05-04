class Car {
	String color;
	String model;
	boolean isElectric;

	//Car class constructor
	Car(String color, String model, boolean isElectric){
		this.color = color;
		this.model = model;
		this.isElectric = isElectric;
	}
}

class Solution {
	public static void main(String[] args){
		Car familyCar = new Car("Red", "SUV", false);
		System.out.println("Family Car - Model: " + familyCar.model + ", Color: " + familyCar.color + ", Electric: " + familyCar.isElectric);
	}
}