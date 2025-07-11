class Solution {
    public int jump(int[] nums) {
        int jump = 0 ;
        int currentend =0;
        int farthest = 0;
        int n = nums.length;
        for (int i =0 ; i < n -1 ; i++){
             farthest = Math.max(farthest , i +  nums[i]);

             if ( i == currentend){
                jump++;
                currentend= farthest;
             }
        }  return jump;
    }
}