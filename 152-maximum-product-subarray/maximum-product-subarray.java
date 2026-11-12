class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int maxproduct = nums[0];
        int minproduct = nums[0];
        for(int i=1;i<nums.length;i++){
            int current  = nums[i];
            if(current<0){
                int temp = maxproduct;
                maxproduct = minproduct;
                minproduct = temp;
            }
            maxproduct = Math.max(current,maxproduct*current);
            minproduct = Math.min(current,minproduct*current);
            max = Math.max(max,maxproduct);
        }
        return max;
    }
}