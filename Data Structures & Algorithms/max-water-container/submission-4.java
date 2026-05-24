class Solution {
    public int maxArea(int[] heights) {

        //the key to solve this ques is if we have bars of container why are we taking minimum height
        //we take minimum height between the two container because even if we take the maximum height,
        // the water will spill from the maximum side to min side, better to take minimum

        int low  = 0;
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
