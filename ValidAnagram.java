/* PROBLEM ------------------------------------------------------
 * Valid Anagram  |  Easy
 * Topics: String, Hash Map
 * Is t an anagram of s?
 * Example: "anagram","nagaram" → true
 * LeetCode: https://leetcode.com/problems/valid-anagram/
 */

// Count up for s, down for t; all zero => anagram.
class ValidAnagram {
    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) if (c != 0) return false;
        return true;
    }
}
