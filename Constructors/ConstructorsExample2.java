public class Dog {
	String breed;
	int age;

	//no-arg constructor
	Dog(){
		breed = "Unknown";
		age = 0;
	}

	// parameterized constructor
	Dog(String breed, int age) {
		this.breed = breed;
		this.age = age;
	}

	// age-only constructor
	Dog(int age){
		this.age = age;
		breed = "Unknown";
	}
}

public class Solution {
	public static void main(String[] args") {
		Dog dog1 = new Dog("Husky", 3);
		System.out.println(dog1.breed);
		System.out.println(dog1.age);

		Dog dog2 = new Dog(10);
		System.out.println(dog2.breed);
		System.out.println(dog2.age);

		Dog dog3 = new Dog();
		System.out.println(dog3.breed);
		System.out.println(dog3.age);
	}
}