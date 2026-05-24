class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0; //we do not need to hold it for multiple days because buying on day 1 and selling on day 3 is equivalent to buying on day 1, selling on day 2 then again buying on day 2 and selling on day 3

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}