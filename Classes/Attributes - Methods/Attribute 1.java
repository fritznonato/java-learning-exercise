class CellPhone {
	String brand = "Galaxy";
	String model = "S21";
	final String chargerType = "Type-C";

	void makeCall() {
		System.out.println("Calling from " + brand + " " + model + " using " + chargerType + " charger...");
	}
}

class Solution {
	public static void main(String[] args) {
		CellPhone myPhone = new CellPhone();
		myPhone.makeCall();
	}
}