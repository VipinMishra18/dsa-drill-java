/* PROBLEM ------------------------------------------------------
 * Pascal triangle  |  Easy
 * Topics: Array
 * Return the first numRows of Pascal's triangle.
 * Example: 5 → [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * LeetCode: https://leetcode.com/problems/pascals-triangle/
 */

import java.util.*;

class PascalTriangle {
    static List<List<Integer>> pascalTriangle(int rows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int row = 1; row <= rows; row++) {
            if (row == 1) {
                ans.add(new ArrayList<>(List.of(1)));
                continue;
            }
            List<Integer> temp = new ArrayList<>();
            List<Integer> prev = ans.get(ans.size() - 1);
            temp.add(1);
            for (int col = 1; col < prev.size(); col++) temp.add(prev.get(col - 1) + prev.get(col));
            temp.add(1);
            ans.add(temp);
        }
        return ans;
    }
}
