// Sum 0..n minus actual sum = the missing value.
class MissingNumber {
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int tSum = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) sum += num;
        return tSum - sum;
    }
}
