class Solution {
    public int candy(int[] ratings) {

        int n = ratings.length;
        int[]candies = new int [n];
        int maxCandies = 0;

        //first we give 1 candy to each child
        Arrays.fill(candies,1);

        //now we need to compare if our has greater than the left neighbour
        for(int i = 1; i < n; i++){
            if(ratings[i] > ratings[i-1]){
                candies[i] = candies[i-1] + 1;
            }
        }

        //now we need to compare if our has greater than the right neighbour
        for(int i = n-2; i>=0; i--){ //started from n-2, to avoid array out of bound index
            if(ratings[i] > ratings[i+1]){
                candies[i] = Math.max(candies[i+1]+1, candies[i]);
            }
        }

        for(int i : candies){
            maxCandies = maxCandies + i;
        }

        return maxCandies;
        
    }
}