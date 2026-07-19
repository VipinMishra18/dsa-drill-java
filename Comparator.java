// Comparator — sort int[] pairs {first, second} ascending by first, then second.
// C++ used a `struct Compare { bool operator()(...) }`; Java uses java.util.Comparator.
class Comparator implements java.util.Comparator<int[]> {
    @Override
    public int compare(int[] p1, int[] p2) {
        if (p1[0] != p2[0]) return Integer.compare(p1[0], p2[0]);
        return Integer.compare(p1[1], p2[1]);
    }
}
