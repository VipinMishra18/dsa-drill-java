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
