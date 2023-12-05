package linearSearch;

public class FindMin {
	
	static int min(int[] arr) {
		int ans = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < ans) {
				ans = arr[i];
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {12, 15, 6, 3, 5, 9, 19};
		System.out.println(min(arr));
	}

}
