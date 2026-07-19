// In-place; returns new length. `i` tracks the last unique slot.
class RemoveDuplicateFromSorted {
    static int removeDuplicateFromSorted(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (nums[i] == nums[j]) continue;
            i++;
            nums[i] = nums[j];
        }
        return i + 1;
    }
}
