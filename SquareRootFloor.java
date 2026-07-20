/* PROBLEM ------------------------------------------------------
 * Square Root Floor  |  Easy
 * Topics: Math, Binary search
 * Integer square root: floor(√n) without using a sqrt function.
 * Example: n=8 → 2
 * LeetCode: https://leetcode.com/problems/sqrtx/
 */

class SquareRootFloor {
    static int squareRootFloorValue(int num) {
        if (num <= 1) return num;
        int l = 0, r = num, ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (m <= num / m) { // use division, not m*m, to avoid overflow
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }
}
