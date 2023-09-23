package PatternsForCoding.K_WayMerge;

import java.util.*;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // Step 1: Sort by start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        // Step 2: Iterate over the intervals
        for (int[] interval : intervals) {
            if (interval[0] <= end) { // Overlapping
                end = Math.max(end, interval[1]);
            } else { // Non-overlapping
                result.add(new int[]{start, end});
                start = interval[0];
                end = interval[1];
            }
        }
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        MergeIntervals mi = new MergeIntervals();
        int[][] intervals = { {1,3}, {2,6}, {8,10}, {15,18} };
        int[][] merged = mi.merge(intervals);

        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

