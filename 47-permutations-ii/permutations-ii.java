class Solution {
    HashSet<List<Integer>> res = new HashSet<>();
    void permutation(int[] nums,boolean[] used, ArrayList<Integer> temp){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            temp.add(nums[i]);
            permutation(nums,used,temp);
            used[i] = false;
            temp.remove(temp.size()-1);
        }
    }


    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        ArrayList<Integer> temp = new ArrayList<>();
        permutation(nums,used,temp);
        return new ArrayList<> (res);
    
    }
}