class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int curr=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            curr=Math.max(curr+nums[i],nums[i]);
            max=Math.max(max,curr);
       }
       return max;

    }
}