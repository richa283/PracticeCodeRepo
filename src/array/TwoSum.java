package array;

import java.util.HashMap;

public class TwoSum {
	
	public int[] twoSums(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i<nums.length; i++) {
			int complement = target - nums[i];
			
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
			}
			
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
		
	}

	public static void main(String[] args) {
		TwoSum sum = new TwoSum();
				
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		int[] result = sum.twoSums(nums, target);
		System.out.println("Indices: " + result[0] + ", " + result[1]);
	}
}
