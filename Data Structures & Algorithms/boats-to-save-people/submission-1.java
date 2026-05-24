class Solution {
    public int numRescueBoats(int[] people, int limit) {

        //minimum number of boats to save people we will sort the array so that we could
        //have the lightest person at the left pointer and heaviest at the right
        //if the weight exceeds the limit then we can only take heavier person
        //otherwise we can take light person also
        Arrays.sort(people);
        int n = people.length;
        int l = 0;
        int r = n-1;
        int count = 0;

        while(l<=r){
            int weight = people[l]+people[r];
            if(weight <= limit){
                l++;
            }
                r--;
            count++;
        }
        return count;
    }
}