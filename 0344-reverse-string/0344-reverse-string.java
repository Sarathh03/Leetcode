class Solution {
    public void reverseString(char[] s) {
        ArrayList<Character> res = new ArrayList<>();
        for(int i =0;i<s.length;i++){
            res.add(s[i]);
        }
        Collections.reverse(res);
        for(int i=0;i<s.length;i++){
            s[i] = res.get(i);
        }
    }
}