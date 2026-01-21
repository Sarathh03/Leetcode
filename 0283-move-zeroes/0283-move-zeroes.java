class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;
        ArrayList<Integer> ans =  new ArrayList<>();
        for(int i =0;i<n;i++){
            if(nums[i]!=0){
                ans.add(nums[i]);
            }
        }
        while(ans.size()<n){
            ans.add(0);
        }
        for(int i=0;i<n;i++){
            nums[i]= ans.get(i);
        }

    }
}