class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        //so we will be having three conditions for merging the intervals
        //all the intervals in the range is smaller than the given interval
        //merge all the intervals before the given interval
        //the interval overlap with the new interval, we will merge the new interval
        //in all other cases means given interval is smaller, we will put it before

        List<int[]> ans = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        //Add all the intervals before
        while(i < n && intervals[i][1] < newInterval[0]){
            ans.add(intervals[i]);
            i++;
        }

        while(i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        ans.add(newInterval);

        while(i < n){
            ans.add(intervals[i]);
            i++;
        }

        return ans.toArray(new int[ans.size()][]);
        
    }
}
