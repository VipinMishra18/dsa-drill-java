import java.util.*;

// Houses in a circle: rob either [0, n-2] or [1, n-1], never both ends.
class HouseRobberII {
    static int houseRobber(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        return Math.max(solve(nums, 0, n - 2), solve(nums, 1, n - 1));
    }

    private static int solve(int[] nums, int l, int r) {
        int[] cache = new int[nums.length];
        Arrays.fill(cache, -1);
        return dfs(nums, l, r, cache);
    }

    private static int dfs(int[] nums, int i, int r, int[] cache) {
        if (i > r) return 0;
        if (cache[i] != -1) return cache[i];
        int take = nums[i] + dfs(nums, i + 2, r, cache);
        int dontTake = dfs(nums, i + 1, r, cache);
        return cache[i] = Math.max(take, dontTake);
    }
}
