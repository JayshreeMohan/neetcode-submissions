/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int left = 1;
        int right = n;
        //instead of guessing all the numbers, we are guessing the middle
        while(true){
            int mid = left + (right - left)/2;
            int res = guess(mid);

            //on the basis of the value of mid we will decide whether we have to move left or right or stay where we are
            if(res > 0){
                left = mid + 1;
            }
            else if(res < 0){
                right = mid - 1;
            }
            else{
                return mid;
            }
        }
        
    }
}