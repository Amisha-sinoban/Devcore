class Solution {
    public int climbStairs(int n) {
        if ( n <= 2){
            return n;
        }

        int twostepBefore = 1;
        int onestepBefore = 2;

        for (int i= 3 ;i<=n; i++){

            int currentways = onestepBefore +twostepBefore;

            twostepBefore = onestepBefore ;
            onestepBefore =currentways;
        }

        return onestepBefore;
    }
}