// Two intervals overlap OR touch at an endpoint. Order-independent.
class IntervalOverlapOrTouch {
    static boolean overlapOrTouch(int[] p1, int[] p2) {
        int[] lo = p1[0] <= p2[0] ? p1 : p2;
        int[] hi = p1[0] <= p2[0] ? p2 : p1;
        return lo[1] >= hi[0];
    }
}
