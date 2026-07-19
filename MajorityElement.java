// Boyer-Moore voting (element appearing > n/2 times).
class MajorityElement {
    static int majorityElement(int[] nums) {
        int votes = 0, ans = 0;
        for (int num : nums) {
            if (votes == 0) ans = num;
            if (ans == num) votes++;
            else votes--;
        }
        return ans;
    }
}
