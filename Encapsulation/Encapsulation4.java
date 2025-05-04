class Car {
	private String model;
	private int year;

	public String getModel(){
		return model;
	}

	public void setModel(String newModel){
		model = newModel;
	}

	publi int getYear(){
		return year;
	}

	public void setYear(int newYear){
		year = newYear;
	}
}

class Solution {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setModel("Tesla Model S");
		myCar.setYear(2023);
		System.out.println("Model: " + myCar.getModel() + " , Year: " + myCar.getYear());
	}
}