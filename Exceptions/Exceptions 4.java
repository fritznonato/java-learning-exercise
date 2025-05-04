class Solution {
	public static void main(String[] args){
		int[] employeeIds = {101, 102,103};
		try {
			System.out.println(employeeIds[100]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("That employee Id does not exist. Error: " + e.getMessage());
		}
	}
}