class Solution {
    public int maxArea(int[] heights) {

        //for trapping water we need to take the minimum heights between the heights because otherwise the water will spill over

        int n = heights.length;
        int l = 0;
        int r = n-1;
        int maxArea = 0;

        while(l < r){
            int height = Math.min(heights[l],heights[r]);

            int width = r-l;

            int area = height*width;

            maxArea = Math.max(area,maxArea);

            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }


        }

        return maxArea;



        
    }
}
