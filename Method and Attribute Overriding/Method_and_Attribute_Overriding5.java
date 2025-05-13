class CellPhone {
	protected void connectToInternet(){
		System.out.println("Connecting through 3G.");
	}
}

class Smarphone extends CellPhone {
	@Override
	public void connectToInternet(){
		System.out.println("Connecting through Wi-Fi.");
	}
}

class Solution {
	public static void main(String[] args) {
		Smarphone myPhone = new Smarphone();
		myPhone.connectToInternet();
	}
}