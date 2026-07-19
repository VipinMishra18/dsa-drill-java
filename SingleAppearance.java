// Every element appears twice except one; XOR cancels the pairs.
class SingleAppearance {
    static int findNumberWhichAppearsOnce(int[] nums) {
        int ans = 0;
        for (int num : nums) ans ^= num;
        return ans;
    }
}
