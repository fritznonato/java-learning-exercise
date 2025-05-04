class Car {
	String model;
	int year;

	Car(String model, int year){
		this.model = model;
		this.year = year;
	}

	String displayInfo(){
		return "Model: " + model + ", Year: " + year;
	}
}

class Solution {
	public static void main(String[] args) {
		Car myCar = new Car("Thunder", 2021);
		System.out.println(myCar.displayInfo());
	}
}