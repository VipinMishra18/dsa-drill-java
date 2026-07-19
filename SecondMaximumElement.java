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
