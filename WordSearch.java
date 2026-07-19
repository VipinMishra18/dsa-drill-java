// DFS from each cell; temporarily blank a used cell to avoid reuse.
class WordSearch {
    static boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int r = 0; r < m; r++)
            for (int c = 0; c < n; c++)
                if (dfs(board, r, c, word, 0, m, n)) return true;
        return false;
    }

    private static boolean dfs(char[][] b, int r, int c, String w, int i, int m, int n) {
        if (i == w.length()) return true;
        if (r < 0 || c < 0 || r >= m || c >= n || b[r][c] != w.charAt(i)) return false;

        char tmp = b[r][c];
        b[r][c] = '#';
        boolean found = dfs(b, r + 1, c, w, i + 1, m, n) || dfs(b, r - 1, c, w, i + 1, m, n)
                     || dfs(b, r, c + 1, w, i + 1, m, n) || dfs(b, r, c - 1, w, i + 1, m, n);
        b[r][c] = tmp;
        return found;
    }
}
