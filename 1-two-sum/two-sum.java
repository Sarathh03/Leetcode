class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            int val = nums[i];
            int fin = target - val;
            if(map.containsKey(fin)){
                return new int[] {map.get(fin),i};
            }else{
                map.put(val,i);
            }
        }
            return new int[]{};
    }
}