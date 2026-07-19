import java.util.*;

class MergeIntervals {
    static int[][] mergeInterval(int[][] intervals) {
        if (intervals.length < 2) return intervals;

        Arrays.sort(intervals, (a, b) ->
            a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));

        List<int[]> ans = new ArrayList<>();
        int[] prev = {intervals[0][0], intervals[0][1]};
        int n = intervals.length;
        for (int i = 1; i < n; i++) {
            int[] curr = {intervals[i][0], intervals[i][1]};
            if (IntervalOverlapOrTouch.overlapOrTouch(prev, curr)) {
                prev = new int[]{Math.min(prev[0], curr[0]), Math.max(prev[1], curr[1])};
                continue;
            }
            ans.add(prev);
            prev = curr;
        }
        ans.add(prev);
        return ans.toArray(new int[0][]);
    }
}
