class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int l = 1; //minimum speed can eat one banana
        int r = Arrays.stream(piles).max().getAsInt(); //maximum speed is the largest pile
        int res = r; // keeping the res as maximum speed

        while(l<=r){
            int mid = (l+r)/2;
            long time = 0;
            for(int p:piles){
                time+= Math.ceil((double)p/mid);
            }
            if(time <= h){
                res = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }

        return res;
        
    }
}
