class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        if(intervals == null || intervals.length <= 1){
            return true;
        }
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

        int[] current = intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] next = intervals[i];
            if(current[1] > next[0]){
                return false;
            }
            current = next;
        }
        return true;
    }
}

Time: O(n log n)
Space: O(log n)