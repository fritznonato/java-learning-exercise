abstract class Animal {
	abstract void eat();
}

class Lion extends Animal {
	@Override
	public void eat() {
		System.out.println("Lion is eating meat in the savanna.");
	}
}

class Solution {
	public static void main(String[] args) {
		Lion king = new Lion();
		king.eat();
	}
}