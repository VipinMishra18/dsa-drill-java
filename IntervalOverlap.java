/* PROBLEM ------------------------------------------------------
 * Interval overlap  |  Core
 * Topics: Interval
 * Do two intervals [start,end] strictly overlap?
 * Example: [1,3],[2,4] → true
 */

// Two intervals [start, end] share interior (strict overlap). Order-independent.
class IntervalOverlap {
    static boolean overlap(int[] p1, int[] p2) {
        int[] lo = p1[0] <= p2[0] ? p1 : p2;
        int[] hi = p1[0] <= p2[0] ? p2 : p1;
        return lo[1] > hi[0];
    }
}
