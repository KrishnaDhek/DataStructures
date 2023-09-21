package PatternsForCoding.Heap;

import java.util.*;

public class SlidingWindowMedian {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // numbers below the median
    PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // numbers above the median

    public double[] medianSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        double[] result = new double[n - k + 1];

        for (int i = 0; i < n; i++) {
            if (maxHeap.size() == 0 || nums[i] <= maxHeap.peek()) {
                maxHeap.add(nums[i]);
            } else {
                minHeap.add(nums[i]);
            }

            // Adjust size
            while (maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.poll());
            }
            while (minHeap.size() > maxHeap.size()) {
                maxHeap.add(minHeap.poll());
            }

            if (i >= k - 1) {
                if (k % 2 == 0) {
                    result[i - k + 1] = ((double) maxHeap.peek() + (double) minHeap.peek()) / 2;
                } else {
                    result[i - k + 1] = (double) maxHeap.peek();
                }

                // Remove the element going out of the sliding window
                if (nums[i - k + 1] <= maxHeap.peek()) {
                    maxHeap.remove(nums[i - k + 1]);
                } else {
                    minHeap.remove(nums[i - k + 1]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SlidingWindowMedian obj = new SlidingWindowMedian();
        double[] result = obj.medianSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        System.out.println(Arrays.toString(result)); // Expected: [1, -1, -1, 3, 5, 6]
    }
}

