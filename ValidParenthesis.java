/* PROBLEM ------------------------------------------------------
 * Valid parenthesis  |  Easy
 * Topics: Stack
 * Is the string of ()[]{} brackets validly matched and nested?
 * Example: "([]{})" → true, "(]" → false
 * LeetCode: https://leetcode.com/problems/valid-parentheses/
 */

import java.util.*;

class ValidParenthesis {
    static boolean isValid(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!stk.isEmpty() && isClose(c) && isMatch(stk.peek(), c)) {
                stk.pop();
                continue;
            }
            stk.push(c);
        }
        return stk.isEmpty();
    }

    private static boolean isClose(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    private static boolean isMatch(char c1, char c2) {
        return (c1 == '(' && c2 == ')')
            || (c1 == '[' && c2 == ']')
            || (c1 == '{' && c2 == '}');
    }
}
