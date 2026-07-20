/* PROBLEM ------------------------------------------------------
 * Longest Substring Without Repeating  |  Medium
 * Topics: Sliding Window, String
 * Length of the longest substring without repeating characters.
 * Example: "abcabcbb" → 3
 * LeetCode: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

import java.util.*;

// Sliding window; jump the left edge past the last occurrence of a repeat.
class LongestSubstringWithoutRepeat {
    static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> last = new HashMap<>();
        int ans = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (last.containsKey(c) && last.get(c) >= start) start = last.get(c) + 1;
            last.put(c, i);
            ans = Math.max(ans, i - start + 1);
        }
        return ans;
    }
}
