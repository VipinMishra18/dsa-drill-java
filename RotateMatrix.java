// Rotate a square matrix 90 degrees: transpose, then flip horizontally.
class RotateMatrix {
    static void rotateSquareGrid(int[][] matrix) {
        transpose(matrix);
        hFlip(matrix);
    }

    static void transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for (int r = 0; r < m; r++)
            for (int c = r; c < n; c++)
                swap(matrix, r, c, c, r);
    }

    static void hFlip(int[][] matrix) {
        int n = matrix.length;
        for (int r = 0; r < n; r++)
            for (int c = 0; c < n / 2; c++)
                swap(matrix, r, c, r, n - 1 - c);
    }

    private static void swap(int[][] a, int r1, int c1, int r2, int c2) {
        int t = a[r1][c1]; a[r1][c1] = a[r2][c2]; a[r2][c2] = t;
    }
}
