package array;

public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		
		if(prices == null || prices.length == 0) {
			return 0;
		}
		
		int maxProfit = 0;
		int minPrice = prices[0];
		
		for(int i=1; i<prices.length; i++) {
			if(prices[i] < minPrice) {
				minPrice = prices[i];
			}else {
				int currentProfit = prices[i] - minPrice;
				if(currentProfit > maxProfit) {
					maxProfit = currentProfit;
				}
			}
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		int[] prices = {7, 1, 10, 2, 8, 9};
		BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();
		int profit = stock.maxProfit(prices);
		System.out.println("The maximum profit is: "+profit);
	}

}
