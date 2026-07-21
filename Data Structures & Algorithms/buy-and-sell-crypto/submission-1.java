class Solution {
    public int maxProfit(int[] prices) {

        //the only difference between best time to buy and sell stocks and best time to buy and sell stocks 2 is that
        //in the first part we can only perform a single transaction on single day
        //but in buy and sell stocks 2, we can perform any number of transactions on one day

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            minPrice = Math.min(minPrice,price);
            maxProfit = Math.max(maxProfit,price-minPrice);
        }

        return maxProfit;
        
    }
}
