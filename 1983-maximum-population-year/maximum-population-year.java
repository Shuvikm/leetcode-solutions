class Solution {
    public int maximumPopulation(int[][] logs) {
        int year[]=new int[2051];

        for(int[] log: logs){
            int birth=log[0];
            int death=log[1];

            year[birth]++;
            year[death]--;
        }
        int max_pop=0;
        int cur_pop=0;
        int ear_pop=1950;

        for(int i=1950;i<=2050;i++){
            cur_pop+=year[i];

            if(cur_pop>max_pop){
                max_pop=cur_pop;
                ear_pop=i;
            }
        }
        return ear_pop;
    }
}