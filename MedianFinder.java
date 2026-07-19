import java.util.*;

// Two heaps: max-heap `lo` for the smaller half, min-heap `hi` for the larger half.
class MedianFinder {
    private PriorityQueue<Integer> lo = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> hi = new PriorityQueue<>();

    void addNum(int num) {
        lo.add(num);
        hi.add(lo.poll());              // balance values
        if (hi.size() > lo.size()) lo.add(hi.poll()); // keep lo >= hi in size
    }

    double findMedian() {
        if (lo.size() > hi.size()) return lo.peek();
        return (lo.peek() + hi.peek()) / 2.0;
    }
}
