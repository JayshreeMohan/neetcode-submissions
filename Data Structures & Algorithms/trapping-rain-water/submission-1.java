class Solution {
    public int trap(int[] height) {

        //total water trapped will be the array of leftmax and rightmax from each element
        //then finding the minimum between them
        //then subtracting the value from them
        //then the sum of it

        int n = height.length;
        int totalWater = 0;
        if(n==0){
            return 0;
        }

        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = height[0];

        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        for(int i=0;i<n;i++){
        totalWater += Math.min(leftMax[i],rightMax[i])-height[i];
        }

        return totalWater;
        
    }
}
