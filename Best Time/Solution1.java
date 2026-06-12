//best time to buy and sell stock solution
public class Solution1 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(price, minPrice);

            int currProfit = price - minPrice;
            maxProfit = Math.max(maxProfit, currProfit);
        }

        return maxProfit;
    }
}