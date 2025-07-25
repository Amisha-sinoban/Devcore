class Solution {
    public int findLHS(int[] nums) {
        Map<Integer , Integer> map= new HashMap<>();

        for (int num: nums){
            map.put(num , map.getOrDefault(num, 0)+1);

        } 
        int maxlen =0 ;
        for ( int key :map.keySet()){
            if (map.containsKey(key+1)){
                int len = map.get(key) + map.get(key+1);
                maxlen = Math.max( maxlen , len);
            }
        }  
        return maxlen;
    }
}