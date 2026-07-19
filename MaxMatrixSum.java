// https://leetcode.com/problems/maximum-matrix-sum/
// Flipping two adjacent signs can move a "-" anywhere. If the count of non-positive
// cells is even, all can be made positive; if odd, one smallest |value| stays negative.
class MaxMatrixSum {
    static long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;
        int neg = 0, minimum = Integer.MAX_VALUE;
        long ans = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int val = matrix[r][c];
                if (val <= 0) neg++;
                ans += Math.abs(val);
                minimum = Math.min(minimum, Math.abs(val));
            }
        }
        return (neg % 2 == 0) ? ans : ans - 2L * minimum;
    }
}
