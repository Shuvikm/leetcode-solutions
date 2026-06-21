class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }   
        if(num %10==0 ||num%100==0){
            return false;
        }
        return true;
      
    }
}