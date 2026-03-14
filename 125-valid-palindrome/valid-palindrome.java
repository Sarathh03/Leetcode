class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        String last = (sb.reverse()).toString();
        if(s.equals(last))return true;
        return false;
    }
}