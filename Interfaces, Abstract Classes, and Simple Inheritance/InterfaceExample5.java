class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	@Override
	void eat() {
		System.out.println("eating dog food...");
	}

	void bark() {
		System.out.println("barking...");
	}
}

Dog dog = new Dog();
dog.eat();