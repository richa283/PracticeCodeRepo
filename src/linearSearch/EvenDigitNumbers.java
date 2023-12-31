package linearSearch;

public class EvenDigitNumbers {

	public int findNumbers(int[] nums) {
		
		int count = 0;
		for(int num : nums) {
			int digitCount = 0;
			while(num != 0) {
				num = num/10;
				digitCount++;
			}
			
			if(digitCount % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		EvenDigitNumbers solution = new EvenDigitNumbers();
		int[] nums = {12, 365, 2, 62, 87};
		int result = solution.findNumbers(nums);
		System.out.println("The count of numbers with even digits is: "+result);
		
	}
}
