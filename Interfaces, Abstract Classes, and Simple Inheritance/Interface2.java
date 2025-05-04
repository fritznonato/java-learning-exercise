interface Animal {
	void eat();
}

class Zebra implements Animal {
	public void eat(){
		System.out.println("Eating tall grass in the savanna...");
	}
}

class Lion implements Animal {
	public void eat() {
		System.out.println("Eating meat...");
	}
}

class Solution {
	public static void main(String[] args) {
		Zebra zebra = new Zebra();
		zebra.eat();

		Lion lion = new Lion();
		lion.eat();
	}
}