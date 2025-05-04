class Vehicle {
	private String licensePlate;

	public String getLicensePlate(){
		return licensePlate;
	}

	public void setLicensePlate(String newPlate){
		if (newPlate.equals("INVALID")){
			this.licensePlate = "UNKNOWN";
		} if else (newPlate.equals("")) {
			this.licensePlate = "UNKNOWN";
		} else {
			this.licensePlate = newPlate;
		}
	}
}

class Solution {
	public static void main(String[] args) {
		Vehicle myCar = new Vehicle();
		myCar.setLicensePlate("XYZ 1234");
		System.out.println(myCar.getLicensePlate());
	}
}