class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l = 0;
        int r = n-1;
        int maxArea = 0;

        while(l < r){
            int minHeight = Math.min(heights[l],heights[r]);
            int width = r-l;
            int area = minHeight * width;
            maxArea = Math.max(area,maxArea);

            if(heights[l] < heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;
        
    }
}
