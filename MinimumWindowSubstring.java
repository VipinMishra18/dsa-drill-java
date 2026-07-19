class MinimumWindowSubstring {
    static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int[] need = new int[128];
        for (char c : t.toCharArray()) need[c]++;

        int required = t.length(), l = 0, bestLen = Integer.MAX_VALUE, bestL = 0;
        for (int r = 0; r < s.length(); r++) {
            if (need[s.charAt(r)]-- > 0) required--;      // consumed a needed char
            while (required == 0) {                        // window valid: shrink
                if (r - l + 1 < bestLen) { bestLen = r - l + 1; bestL = l; }
                if (++need[s.charAt(l)] > 0) required++;   // dropped a needed char
                l++;
            }
        }
        return bestLen == Integer.MAX_VALUE ? "" : s.substring(bestL, bestL + bestLen);
    }
}
