class Solution {
    public int lengthOfLongestSubstring(String s) {
       int st = 0;
       int end =0;
       int maxlen = Math.min(s.length(),1);
       HashSet<Character> set = new HashSet<>();
       while(end<s.length()){
        char ch = s.charAt(end);
        while(set.contains(ch)){
            set.remove(s.charAt(st));
            st+=1;

        }
        set.add(ch);
        int window = end -st +1;
        maxlen = Math.max(window,maxlen);
        end+=1;

       }
       return maxlen;
    }
}