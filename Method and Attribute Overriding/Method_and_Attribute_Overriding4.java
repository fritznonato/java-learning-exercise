class BasicPhone {
	protected void powerOn(){
		System.out.println("BasicPhone powering on.");
	}
}

class SmartPhone extend BasicPhone {
	@Override
	public void powerOn() {
		System.out.println("SmartPhone is powered by a touch screen.");
	}
}

class Solution {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone();
		myPhone.powerOn();
	}
}