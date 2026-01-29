class Solution {
    public int minCostToMoveChips(int[] position) {
        int evencount =0;
        int oddcount = 0;
        for(int val : position){
            if(val%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        return Math.min(evencount,oddcount);
    }
}