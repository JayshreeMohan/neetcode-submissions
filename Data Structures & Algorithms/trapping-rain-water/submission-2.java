class Solution {
    public int trap(int[] height) {

        //maximum area of water that can be trapped will be
        //leftmax from each index and right max from each index
        //finding the minimum between them and subtracting them from the elements
        //and then sum total

        int n = height.length;
        int totalWaterTrapped = 0;
        if(n == 0){
            return 0;
        }

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];

        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        rightMax[n-1] = height[n-1];

        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        for(int i = 0; i < n; i++){
            totalWaterTrapped += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return totalWaterTrapped;
    }
}
