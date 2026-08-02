class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int st = 0;
        int end = numbers.length-1;
        while(st<end){
            int currsum = numbers[st]+numbers[end];
            if(currsum==target){
                return new int[] {st+1,end+1};
            }
            else if(currsum <target)
                st+=1;
            else if(currsum>target)
                end-=1;
        }
        return null;
    }
}