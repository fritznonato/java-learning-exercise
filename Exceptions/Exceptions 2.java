class Solution {
	static void validateAge(int age){
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be negative");			
		}
		System.out.println("The age is: " + age);
	}

	public static void main(String[] args) {
		try {
			validateAge(-5);
		} catch (IllegalArgumentException e) {
			System.out.println("Caught an exception: " + e.getMessage());
		}
	}
}
