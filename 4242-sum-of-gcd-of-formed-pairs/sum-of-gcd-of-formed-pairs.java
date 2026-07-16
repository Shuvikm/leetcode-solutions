class Solution {
    public long gcdSum(int[] nums) {
        int max = -1; 
        int a[] = new int[nums.length]; 
        
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]); 
            a[i] = gcd(max, nums[i]); 
        } 
        
        Arrays.sort(a); 
        long sum = 0; 
        int i = 0; 
        int j = nums.length - 1; 
        
        while (i < j) {
            sum += gcd(a[i], a[j]); 
            i++; 
            j--; 
        } 
        
        return sum; // Added this so the method returns the answer
    }

    // paste this helper method right here inside the class!
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}