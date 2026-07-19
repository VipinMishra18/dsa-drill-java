import java.util.*;

// Stack that returns its minimum in O(1) by storing (value, min-so-far).
class MinStack {
    private Deque<int[]> stack = new ArrayDeque<>();

    void push(int val) {
        int min = stack.isEmpty() ? val : Math.min(val, stack.peek()[1]);
        stack.push(new int[]{val, min});
    }

    void pop() { stack.pop(); }
    int top() { return stack.peek()[0]; }
    int getMin() { return stack.peek()[1]; }
}
