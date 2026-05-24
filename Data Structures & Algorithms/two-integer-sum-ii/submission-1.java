class Solution {
    public int[] twoSum(int[] numbers, int target) {

        //when the array is sorted we can use two sum, but when we have to maintain index and the array is not sorted then we have to use hashmap technique

        int l = 0;
        int r = numbers.length-1;

        while(l < r){
            int currSum = numbers[l] + numbers[r];
            if(currSum < target){
                l++;
            }
            else if(currSum > target){
                r--;
            }
            else{
                return new int[]{l+1,r+1}; // due to one based indexing
            }
        }

        return new int[0];
        
    }
}
