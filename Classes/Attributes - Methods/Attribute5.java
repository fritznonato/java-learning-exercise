class CellPhone {
	String brand = "AnyBrand";
	String model = "AnyModel";
	final String chargerType = "Type-C";

	void callDial(long phoneNumber) {
		System.out.println("Making a call to " + phoneNumber + " with " + brand + " " + model + "...");
	}

	void hangUp(){
		System.out.println("Ending phone call.");
	}
}

class Solution {
	public static void main(String[] args) {
		CellPhone myPhone = new CellPhone();
		myPhone.callDial(1234567890L);
		myPhone.hangUp();
	}
}