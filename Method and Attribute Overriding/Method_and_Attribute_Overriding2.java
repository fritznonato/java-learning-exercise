class CellPhone {
	public void display() {
		System.out.println("Basic cell phone display.");
	}
}

class Smartphone extends CellPhone {
	public void display(){
		System.out.println("Smartphone with HD display.");
	}
}

class Solution {
	public static void main(String[] args) {
		CellPhone myPhone = new CellPhone();
		myPhone.display();
		Smartphone mySmartphone = new Smartphone();
		mySmartphone.display();
	}
}