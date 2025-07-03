class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       
        
        int totaltank = 0;
        int currenttank= 0;
        int startstation=0;
        for(int i = 0; i< gas.length; i++){
            int gain = gas[i]- cost[i];
            totaltank += gain;
            currenttank += gain;
        
            if (currenttank <0 ){
                startstation = i+1;
                currenttank =0;

               
            } 
        }return totaltank >=0? startstation :-1;
    }
}