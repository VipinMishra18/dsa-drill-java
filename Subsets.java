import java.util.*;

// Include/exclude each element.
class Subsets {
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    private static void dfs(int i, int[] nums, List<Integer> cur, List<List<Integer>> ans) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        dfs(i + 1, nums, cur, ans);          // exclude nums[i]
        cur.add(nums[i]);
        dfs(i + 1, nums, cur, ans);          // include nums[i]
        cur.remove(cur.size() - 1);
    }
}
