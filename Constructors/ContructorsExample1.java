class Dog {
	String breed;
	int age;

	Dog(String breed, int age){
		this.breed = breed;
		this.age = age;
		System.out.println("Initialized Dog class with breed=" + this.breed + " and age=" + this.age);
	}
}

class Solution {
	public static void main(String[] args) {
		Dog fido = new Dog("Alsatian" , 5);

		System.out.println(fido.breed);
		System.out.println(fido.age);
	}
}