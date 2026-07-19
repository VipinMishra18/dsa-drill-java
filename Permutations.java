import java.util.*;

class Permutations {
    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(nums, new boolean[nums.length], new ArrayList<>(), ans);
        return ans;
    }

    private static void dfs(int[] nums, boolean[] used, List<Integer> cur, List<List<Integer>> ans) {
        if (cur.size() == nums.length) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            cur.add(nums[i]);
            dfs(nums, used, cur, ans);
            cur.remove(cur.size() - 1);
            used[i] = false;
        }
    }
}
