/* PROBLEM ------------------------------------------------------
 * Next Greater Element  |  Easy
 * Topics: Stack, Monotonic Stack
 * For each element, the next greater element to its right, else -1
 * (monotonic stack).
 * Example: [2,1,2,4,3] → [4,2,4,-1,-1]
 */

import java.util.*;

// For each element, the next strictly greater element to its right (-1 if none).
class NextGreaterElement {
    static int[] nextGreater(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Deque<Integer> stack = new ArrayDeque<>(); // indices with decreasing values
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) ans[stack.pop()] = nums[i];
            stack.push(i);
        }
        return ans;
    }
}
