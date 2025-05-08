abstract class Animal {
	void breathe() {
		System.out.println("Breathing...");
	}
	void eat() 
	}

	class Lion extends Animal {
		void eat() {
			System.out.println("Eating meat...");
		}
	}

	class Solution {
		public static void main(String[] args) {
			Lion simba = new Lion();

			simba.breathe();
			simba.eat();
		}
	}
