class Solution {
	abstract static class Animal {
		abstract void eat(); // An abstract method for eating
	
		void breathe() { // A concrete method for breathing
			System.out.println("Breathing...");
		}
	}

	static class Lion extends Animal {
		void eat() { // Overriding the abstract method with Lion's way of eating
			System.out.println("Eating...");
		}
	}

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.eat();		//Will  print "Eating..."
		lion.breathe();		//Will print "Breathing..."
	}
}