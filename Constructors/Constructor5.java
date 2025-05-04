class Car {
	String model;
	String color;

	Car(String model, String color){
		this.model = model;
		this.color = color;
	}

	String displayInfo(){
		return "Model: " + model + ", Color: " + color;
	}
}

class Solution {
	public static void main(String[] args) {
		Car myCar = new Car("Tesla", "Gray");
		System.out.println(myCar.displayInfo());
	}
}