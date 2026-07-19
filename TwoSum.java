import java.util.*;

class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int need = target - nums[i];
            if (mp.containsKey(need)) return new int[]{mp.get(need), i};
            mp.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
