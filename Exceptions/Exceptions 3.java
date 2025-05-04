class Solution {
	static void checkEmployeeAge(int age){
		if (age < 18){
			throw new IllegalArgumentException("Employee is underage");
		}
		System.out.println("Employee age is : " + age);
	}

	public static void main(String[] args){
		try {
			checkEmployeeAge(16);
		} catch (IllegalArgumentException e) {
			System.out.println("Caught an exception: " + e.getMessage());
		}
	} 
}