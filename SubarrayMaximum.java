// Maximum subarray sum (Kadane).
class SubarrayMaximum {
    static int subarrayMaximum(int[] nums) {
        int ans = Integer.MIN_VALUE, sum = 0;
        for (int num : nums) {
            sum += num;
            if (num > sum) sum = num;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
