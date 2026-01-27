import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        int maxval = nums[0];
        int n = nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            maxval = Math.max(sum,maxval);
            if(sum<0){
                sum = 0;
            }
        }
        return maxval;
    }
}