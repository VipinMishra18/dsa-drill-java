import java.util.*;

// O(n) using a set; only start counting at sequence heads (num-1 absent).
class LongestConsecutive {
    static int longestConsecutive(int[] nums) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        for (int num : set) {
            int count = 0;
            if (!set.contains(num - 1)) {
                count = 1;
                int cur = num;
                while (set.contains(cur + 1)) { cur++; count++; }
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
