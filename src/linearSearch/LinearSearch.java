package linearSearch;

public class LinearSearch {
	
	public static int linearSearch(int[] array, int target) {
		
		for(int i=0; i<array.length; i++) {
			if(array[i]==target)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,33,42,51,67,72,88};
		int target = 33;
		System.out.println(target+ " is found at index " +linearSearch(arr,target));

	}

}
