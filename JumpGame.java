/* PROBLEM ------------------------------------------------------
 * Jump Game I/II  |  Medium
 * Topics: DP, DFS, Greedy
 * Can you reach the last index from index 0? (+ min-jumps variant)
 * Example: [2,3,1,1,4] → true, [3,2,1,0,4] → false
 * LeetCode: https://leetcode.com/problems/jump-game/
 */

// Jump Game I: can we reach the last index? (Greedy "leader" scan.)
// For Jump Game II (min jumps), uncomment the `jumps` bookkeeping.
class JumpGame {
    static boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 1) return true;

        int farthest = 0, leader = 0;
        boolean ans = false;
        // int jumps = 0; // Jump Game II
        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == leader) {
                leader = farthest;
                // jumps++; // Jump Game II
                if (leader == 0) break;                 // stuck at a 0 with no reach
                if (leader >= n - 1) { ans = true; break; }
            }
        }
        return ans;
    }
}
