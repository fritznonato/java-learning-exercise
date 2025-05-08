class Solution {
	public static void main(String[] args) {
		Giraffe g = new Giraffe();
		g.eat();
		g.breathe();
	}
}

abstract class Animal{
	abstract void eat();

	void breathe() {
		System.out.println("Breathing...");
	}
}

class Giraffe extends Animal{
	@Override
	public void eat() {
		System.out.println("Eating form higher greens");
	}
}