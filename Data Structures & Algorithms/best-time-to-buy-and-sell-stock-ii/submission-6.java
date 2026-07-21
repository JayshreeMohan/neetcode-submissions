class Solution {
    public int maxProfit(int[] prices) {

        //as we were saying that in buy and sell stocks 2 we can perform any number of transaction
        //in one day
        //so i am calculating the profit whenever today's price was more than yesterday's price

        int profit = 0;
        
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }

        return profit;

        
    }
}