package linearSearch;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		
		int[][] accounts = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
		};
		
		int maxWealth = maximumWealth(accounts);
		System.out.println("Richest Customer's wealth: "+maxWealth);
	}
	
	public static int maximumWealth(int[][] accounts) {
		
		int maxWealth = 0;
		
		for(int[] customersAccount : accounts) {
			int currentWealth = 0;
			for(int account : customersAccount) {
				currentWealth += account;
			}
			maxWealth = Math.max(maxWealth, currentWealth);
		}
		return maxWealth;
	}
}
