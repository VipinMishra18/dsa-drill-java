/* PROBLEM ------------------------------------------------------
 * Hamming Weight  |  Easy
 * Topics: Bitwise
 * Count the number of set bits in an integer.
 * Example: 11 (1011₂) → 3
 * LeetCode: https://leetcode.com/problems/number-of-1-bits/
 */

class HammingWeight {
    static int hammingWeight(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans += (n & 1);
            n >>>= 1;
        }
        return ans;
    }
}
