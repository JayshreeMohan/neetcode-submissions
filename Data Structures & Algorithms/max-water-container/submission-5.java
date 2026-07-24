class Solution {
    public int maxArea(int[] heights) {

        //the trick to solve this question is we have to min height because if we take max height then water will spill

        int low = 0;
        int high = heights.length - 1;
        int maxArea = 0;

        while(low < high){
            int minHeight = Math.min(heights[low], heights[high]);
            int width = high - low;
            int area = minHeight * width;

            maxArea = Math.max(area,maxArea);
            if(heights[low] < heights[high]){
                low++;
            }
            else{
                high--;
            }
        }

        return maxArea;
        
    }
}
