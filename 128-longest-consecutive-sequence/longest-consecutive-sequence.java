class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length ==0){
            return 0;
        }
        int c = 1;
        int lgst = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                c++;
            }else{
                c=1;
            }
            lgst = Math.max(lgst,c);
        }
        return lgst;
    }
}