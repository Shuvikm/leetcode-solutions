class Solution {
    public int findGCD(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        // Find minimum and maximum
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        // Find GCD of min and max
        int a = min;
        int b = max;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}