/* PROBLEM ------------------------------------------------------
 * Second Maximum Element  |  Easy
 * Topics: Array
 * Return the second-largest distinct element, or -1 if none.
 * Example: [3,1,3,2] → 2
 */

class SecondMaximumElement {
    static int secondMaxElement(int[] nums) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second != Integer.MIN_VALUE ? second : -1;
    }
}
