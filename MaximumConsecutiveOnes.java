class MaximumConsecutiveOnes {
    static int maximumConsecutiveOnes(int[] nums) {
        int count = 0, ans = 0;
        for (int num : nums) {
            if (num == 1) count++;
            else count = 0;
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
