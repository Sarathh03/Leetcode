class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st = 0;
        int end = 0;
        int max = Math.min(s.length(),1);

        Set<Character> seen = new HashSet<>();

        while(end<s.length()){
            char c  = s.charAt(end);
            while(seen.contains(c)){
                seen.remove(s.charAt(st));
                st += 1;
            }
            seen.add(c);
            int windowsize  = end - st +1;
            max = Math.max(max,windowsize);
            end++;
        }
        return max;
    }
}