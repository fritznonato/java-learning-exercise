class CellPhone {
	String brand = "GadgetCo";
	String model = "SuperPhone";
	final String chargerType = "Type-C";

	void makeCall() {
		System.out.println("Making a call with the " + model + " by " + brand + "...");
	}
}

class Solution {
	public static void main(String[] args) {
		CellPhone myPhone = new CellPhone();
		myPhone.makeCall();
	}
}