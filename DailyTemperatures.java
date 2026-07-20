/* PROBLEM ------------------------------------------------------
 * Daily Temperatures  |  Medium
 * Topics: Stack, Monotonic Stack
 * Days to wait until a warmer temperature (monotonic stack).
 * Example: [73,74,75,71,69,72,76,73] → [1,1,4,2,1,1,0,0]
 * LeetCode: https://leetcode.com/problems/daily-temperatures/
 */

import java.util.*;

// Days to wait until a warmer temperature (0 if none).
class DailyTemperatures {
    static int[] dailyTemperatures(int[] temps) {
        int n = temps.length;
        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<>(); // indices
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temps[stack.peek()] < temps[i]) {
                int j = stack.pop();
                ans[j] = i - j;
            }
            stack.push(i);
        }
        return ans;
    }
}
