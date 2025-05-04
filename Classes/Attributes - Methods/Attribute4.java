class CellPhone {
	String brand = "TechPhone";
	String model = "X2";
	final String chargerType = "Micro-USB";

	void makeCall(){
		System.out.println("Making a call with the " + brand + " " + model + "...");
	}
}
	class Solution {
		public static void main(String[] args) {
			CellPhone myPhone = new CellPhone();
			myPhone.makeCall();
		}
}