/* PROBLEM ------------------------------------------------------
 * GCD and LCM  |  Core
 * Topics: Math
 * GCD via Euclid's algorithm, and LCM = a*b/gcd.
 * Example: gcd(48,18)=6, lcm=144
 */

// Euclid's algorithm.
class Gcd {
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    static long lcm(int a, int b) {
        return (long) a / gcd(a, b) * b;
    }
}
