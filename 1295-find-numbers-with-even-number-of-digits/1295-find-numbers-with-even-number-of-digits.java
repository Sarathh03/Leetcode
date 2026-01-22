class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int digit = 0;
            int temp = nums[i];
            while(temp>0){
                temp = temp/10;
                digit++;
            }
            if(digit%2==0){
                count++;
            }

        }
        return count;
    }
}