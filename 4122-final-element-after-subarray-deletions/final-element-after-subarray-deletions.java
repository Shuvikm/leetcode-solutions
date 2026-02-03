class Solution {
    public int finalElement(int[] nums) {
        int n=nums.length-1;
        if(nums[0]<nums[n])return nums[n];
        else return nums[0];
    }
}