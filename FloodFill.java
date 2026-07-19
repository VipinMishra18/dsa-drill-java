class FloodFill {
    private static final int[][] DIRS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length, n = image[0].length;
        int targetColor = image[sr][sc];
        dfs(image, sr, sc, color, targetColor, m, n);
        return image;
    }

    private static void dfs(int[][] image, int r, int c, int color, int targetColor, int m, int n) {
        if (targetColor == color) return; // avoids infinite recursion when already the target color
        if (r < 0 || c < 0 || r >= m || c >= n || image[r][c] != targetColor) return;
        image[r][c] = color;
        for (int[] d : DIRS) dfs(image, r + d[0], c + d[1], color, targetColor, m, n);
    }
}
