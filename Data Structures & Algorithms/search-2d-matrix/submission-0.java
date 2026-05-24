class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        //searching in a 2d matrix can also work as staircase problem
        //the values are sorted in asending order from left to right
        //the values are also sorted in ascending order from top to bottom
        //so we will move like staircase , if current value is smaller than target , we will move left
        //if the current value is greater than target then move down

        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int c = n-1;

        while(r<m && c>=0){
            if(matrix[r][c] > target){
                c--;
            }
            else if(matrix[r][c] < target){
                r++;
            }
            else{
                return true;
            }
        }
         return false;
    }
}
