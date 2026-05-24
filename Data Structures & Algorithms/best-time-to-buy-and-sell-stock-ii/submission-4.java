class Solution {
    public int maxProfit(int[] prices) {

        //profit will happen if the day we buy the item, price is less than the next day on which we sell it
        //if we are buying an item at 1st and selling it at 3rd then it is same as buying at 1st, selling at 2nd , then again buying at 2nd and selling at 3rd

        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                 profit += prices[i] - prices[i-1];
            }

        }
        return profit;
        
    }
}