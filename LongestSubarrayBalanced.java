import java.util.*;

// nums is binary; "balanced" = equal count of 0s and 1s.
class LongestSubarrayBalanced {
    static int longestSubarrayWithBalance(int[] nums) {
        int n = nums.length, ans = 0, b = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        for (int i = 0; i < n; i++) {
            b += nums[i] == 1 ? 1 : -1;
            if (mp.containsKey(b)) ans = Math.max(ans, i - mp.get(b));
            if (!mp.containsKey(b)) mp.put(b, i); // first occurrence
        }
        return ans;
    }
}
