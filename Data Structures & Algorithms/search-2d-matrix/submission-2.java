class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        //the easiest way to search in a 2d matrix is to consider it like a 1d array
        //just consider the list is flattened and it is a 1D array
        //then the list will look something likwe this 1,2,4,8,10,11,12,13...
        int m = matrix.length; //it will give me 3
        int n = matrix[0].length;

        int left = 0;
        int right = m * n - 1; //because we are hypothetically considering that we 
        //we are flattening the array , so the total number of elements will bem*n-1

        while(left <= right){
            int mid = left + (right - left)/2; //this is our hypothetical mid index3
            int row = mid/n; //actual row
            int col = mid%n; //actual col

            if(matrix[row][col] == target){
                return true;
            } 
            else if(matrix[row][col] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
            
        }

        return false;

    }
}
