// Two pointers: swap non-zeros to the front, zeros drift to the end.
class MoveZerosToEnd {
    static void moveZerosToEnd(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] == 0) continue;
            int t = nums[i]; nums[i] = nums[j]; nums[j] = t;
            i++;
        }
    }
}
