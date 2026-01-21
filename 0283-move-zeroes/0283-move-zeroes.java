class Solution {
    public void moveZeroes(int[] nums) {


        int n = nums.length;
        // int count = 0;
        // ArrayList<Integer> ans =  new ArrayList<>();
        // for(int i =0;i<n;i++){
        //     if(nums[i]!=0){
        //         ans.add(nums[i]);
        //     }
        // }
        // while(ans.size()<n){
        //     ans.add(0);
        // }
        // for(int i=0;i<n;i++){
        //     nums[i]= ans.get(i);
        // }

        int z=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[z] = nums[i];
                z++;
            }
        }
        for(int i = z;i<n;i++){
            nums[i] = 0;
        }

        // int i=0;
        // int z =1;
        // while(z<n){
        //     if(nums[i]==0){
        //         if(nums[z]!=0){
        //             int temp = nums[i];
        //             nums[i] = nums[z];
        //             nums[z] = temp; 
        //             i++;
        //             z++;
        //         }else{
        //             z++;
        //         }
        //     }else{
        //         i++;
        //         z++;
        //     }
        // }
       

    }
}