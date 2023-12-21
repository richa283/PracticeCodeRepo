package array;

public class MaximumSubarray {
	
	public int maxSubArray(int[] nums) {
		
		if(nums == null || nums.length == 0) {
			return 0;
		}
		
		int maxCurrent = nums[0];
		int maxGlobal = nums[0];
		
		for(int i = 1; i< nums.length; i++) {
			maxCurrent = Math.max(nums[i],maxCurrent + nums[i]);
			maxGlobal = Math.max(maxCurrent, maxGlobal);
		}
		return maxGlobal;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSubarray subarray = new MaximumSubarray();
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int result = subarray.maxSubArray(arr);
		System.out.println("Maximum sum of a contiguous subarray: " +result);

	}

}
