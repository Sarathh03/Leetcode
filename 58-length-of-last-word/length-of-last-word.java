class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastindex = s.lastIndexOf(" ");
        int len = s.length() - lastindex - 1;
        return len;

    }
}