class CellPhone {
	String brand = "AnyBrand";
	String model = "AnyModel";
	final String chargerType = "MicroUSB";
	String softwareVersion = "v1.0";

	public void updateSoftwareVersion(String newVersion){
		this.softwareVersion =  newVersion;
		System.out.println("Software update to " + newVersion);
	}
}

class Solution {
	public static void main(String[] args) {
		CellPhone myPhone = new CellPhone();
		myPhone.updateSoftwareVersion("v2.0");
		System.out.println(myPhone.softwareVersion);
	}
}