// Expand around each center (odd + even) and track the longest window.
class LongestPalindromicSubstring {
    static String longestPalindrome(String s) {
        int n = s.length();
        int[] res = {0, 0}; // {start, maxLen}
        for (int i = 0; i < n; i++) {
            spread(s, i, i, res);
            spread(s, i, i + 1, res);
        }
        return s.substring(res[0], res[0] + res[1]);
    }

    private static void spread(String s, int i, int j, int[] res) {
        int n = s.length();
        while (i > -1 && j < n && s.charAt(i) == s.charAt(j)) {
            int len = j - i + 1;
            if (len > res[1]) {
                res[1] = len;
                res[0] = i;
            }
            i--;
            j++;
        }
    }
}
