class BasicCellPhone {
	protected String batteryType = "Removable";

	public void powerOn(){
		System.out.println("Basic CellPhone powering on with " + batteryType + " battery.");
	}
}

class CellPhone extends BasicCellPhone {
	protected String batteryType = "Non-removable";

	public void powerOn() {
		System.out.println("Smartphone powering on with " + batteryType + " battery.");
	}
}

class Solution {
	public static void main(String[] args) {
		CellPhone myPhone = new CellPhone();
		myPhone.powerOn();
	}
}