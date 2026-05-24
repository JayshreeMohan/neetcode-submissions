class Solution {
    public int maxArea(int[] heights) {

        int n = heights.length;
        int l = 0;
        int r = n-1;
        int maxAre = 0;

        while(l<r){
            int height = Math.min(heights[l],heights[r]); // we are taking the height as minimum because water will only be trapped in minimum height , it can't get trapped in maximum height because then the water will spill over
            int width = r-l;
            int area = height*width;

            maxAre = Math.max(maxAre,area);
            if(heights[l] < heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        
        return maxAre;
    }
}
