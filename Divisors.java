/* PROBLEM ------------------------------------------------------
 * Divisors  |  Core
 * Topics: core
 * Return all divisors of n, looping only to √n and pairing i with n/i.
 * Example: n=12 → [1,2,3,4,6,12]
 */

import java.util.*;

// Only loop to sqrt(num) => reduces time from O(n) -> O(sqrt(n)).
// When i divides num, its pair num/i lives past sqrt(num), so we collect both.
class Divisors {
    static List<Integer> findDivisors(int num) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; (long) i * i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
                if (num / i != i) divisors.add(num / i);
            }
        }
        return divisors;
    }
}
