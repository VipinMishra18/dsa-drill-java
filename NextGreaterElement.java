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
