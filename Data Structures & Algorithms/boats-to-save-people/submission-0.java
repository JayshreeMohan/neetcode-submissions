class Solution {
    public int numRescueBoats(int[] people, int limit) {
        //we will sort the array so that we can pair the light and the heaviest person together
        // so left pointer on light and right pointer on heavy person
        //if the weight of light person and heavier person is <= limit then include both in limit by doing left++ and right--
        //if not then only heavier person will get included

        Arrays.sort(people);
        int left = 0;
        int right = people.length-1;
        int count = 0;

        while(left<=right){

            if(people[left]+people[right]<=limit){
                left++;
            }
            right--; // if people are not <= limit then only the heavier person will go
            count++;
        }

        return count;
        
    }
}