class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        //normal speed distance time problem
        //we have to find the min rate so that all the bananas are eaten and if we
        //start one hour then we have to finish eating one pile in that hour.

        int left = 1; //min k is first pile
        int right = 0;

        for(int pile : piles){
            right = Math.max(pile,right);
        }

        int ans = right;
        //we have to move forward with time
        while(left <= right){
            
            int mid = left + (right - left)/2;
            int hours = 0;
            
            //calculating total hours needed at speed mid
            for(int pile : piles){
                hours += (pile + mid - 1)/mid;  //pile+mid is to accomodate decimal
            }
                if(hours <= h){
                    ans = mid;
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }

            
        }

    return ans;


        
    }
}
