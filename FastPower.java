/* PROBLEM ------------------------------------------------------
 * Fast Power (Binary Exponentiation)  |  Medium
 * Topics: Math
 * Fast exponentiation x^n in O(log n) (+ modular power).
 * Example: 2^10 → 1024
 * LeetCode: https://leetcode.com/problems/powx-n/
 */

class FastPower {
    // x^n via binary exponentiation.
    static double power(double x, int n) {
        long e = n;
        if (e < 0) { x = 1 / x; e = -e; }
        double ans = 1;
        while (e > 0) {
            if ((e & 1) == 1) ans *= x;
            x *= x;
            e >>= 1;
        }
        return ans;
    }

    // (base^exp) % mod, safe for large exponents.
    static long modPow(long base, long exp, long mod) {
        base %= mod;
        long ans = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) ans = ans * base % mod;
            base = base * base % mod;
            exp >>= 1;
        }
        return ans;
    }
}
