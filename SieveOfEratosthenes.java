import java.util.*;

// All primes up to n; cross out multiples starting at i*i.
class SieveOfEratosthenes {
    static List<Integer> primesUpTo(int n) {
        boolean[] composite = new boolean[n + 1];
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (!composite[i]) {
                primes.add(i);
                for (long j = (long) i * i; j <= n; j += i) composite[(int) j] = true;
            }
        }
        return primes;
    }
}
