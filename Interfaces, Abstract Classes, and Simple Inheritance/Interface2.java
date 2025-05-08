class Solution {
	public static void main(String[] args) {
		Zebra zebra = new Zebra();
		zebra.eat();

		Lion lion = new Lion();
		lion.eat();
	}
}

class Zebra {
	public void eat() {
		System.out.println("Eating tall grass in the savanna...");
	}
}

class Lion {
	public void eat() {
		System.out.println("Eating meat...");
	}
}