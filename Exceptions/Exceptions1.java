class Solution {
	static void checkEmployeeID(int employeeID) throws IllegalArgumentException{
		if (employeeID <= 0 || employeeID > 10000) {
			throw new IllegalArgumentException("Employee ID must be greater than 0 and less than 10000");
		}

		System.out.println("Employee ID is valid.");
	}

	public static void main(String[] args){
		try {
			checkEmployeeID(10001);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}

