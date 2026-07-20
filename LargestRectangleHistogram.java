/* PROBLEM ------------------------------------------------------
 * Largest Rectangle in Histogram  |  Hard
 * Topics: Stack, Monotonic Stack
 * Largest rectangle area in a histogram (monotonic stack).
 * Example: [2,1,5,6,2,3] → 10
 * LeetCode: https://leetcode.com/problems/largest-rectangle-in-histogram/
 */

import java.util.*;

// Monotonic increasing stack of indices; a sentinel bar of height 0 flushes it.
class LargestRectangleHistogram {
    static int largestRectangleArea(int[] heights) {
        int n = heights.length, ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && heights[stack.peek()] >= h) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                ans = Math.max(ans, height * width);
            }
            stack.push(i);
        }
        return ans;
    }
}
