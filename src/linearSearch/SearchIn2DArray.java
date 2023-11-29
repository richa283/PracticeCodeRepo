package linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr={ 
				{34,52,87,64},
				{35,67,42},
				{65,74,34,109},
				{23,45}
	};
		int target = 23;
		int[] ans = search(arr, target);
		System.out.println(target+ " is found at coordinates: " +Arrays.toString(ans));
		
	}

	static int[] search(int[][] arr, int target){
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col <arr[row].length; col++) {
				if(arr[row][col] == target)
					return new int[]{row, col};
			}
		}
		return new int[]{-1, -1};
	}
}
