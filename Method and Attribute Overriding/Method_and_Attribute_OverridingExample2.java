public class CellPhone {
	// An attribute in the parent class
	public boolean hasTouchScreen = false;
}

public class Smartphone extends CellPhone {
	//The same attribute overridden in the child class
	public boolean hasTouchScreen = true;
}