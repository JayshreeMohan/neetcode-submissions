/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        //in this if the intervals are overlapping then we have to return false
        //else return true

        Collections.sort(intervals,(a,b) -> a.start - b.start);

        for(int i = 1; i < intervals.size(); i++){
            if(intervals.get(i-1).end > intervals.get(i).start){
                return false;
            }
        }
        return true;

    }
}
