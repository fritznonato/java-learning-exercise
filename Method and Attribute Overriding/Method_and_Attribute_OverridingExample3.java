public class CellPhone {
	//Protected attribute in parent class
	protected boolean hasPhysicalKeypad = true;
}

public class Smartphone extends CellPhone {
	//The protected attribute overridden in the child class
	protected boolean hasPhysicalKeypad = false;
}

CellPhone phone = new CellPhone();
System.out.println(phone.hasPhysicalKeypad);