package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = {-23, -21,-16, -13, -5, -1, 0, 1, 6, 9, 17, 24, 32};
		int target = 24;
		
		int ans = binarySearch(arr, target);
		System.out.println(ans);
	}
	
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(target < arr[mid]) {
				end = mid - 1;
			}else if(target > arr[mid]) {
				start = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
