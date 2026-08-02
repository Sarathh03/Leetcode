class Solution {
    public boolean isPalindrome(String s) {
        // s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        // StringBuilder sb = new StringBuilder(s);
        // String last = (sb.reverse()).toString();
        // if(s.equals(last))return true;
        // return false;
        int st = 0;
        int end = s.length()-1;
        while(st<end){
            if(Character.isLetter(s.charAt(st))&& Character.isLetter(s.charAt(end))){
                if(Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))){
                    return false;
                }
                st+=1;
                end -= 1;
            }
            else if(Character.isDigit(s.charAt(st))&& Character.isDigit(s.charAt(end))){
                if(s.charAt(st)!= s.charAt(end)){
                    return false;
                }
                st+=1;
                end-=1;
            }
            else if(!Character.isLetter(s.charAt(st)) && !Character.isDigit(s.charAt(st)))
                st+=1;
            else if(!Character.isLetter(s.charAt(end)) && !Character.isDigit(s.charAt(end)))
                end -=1;
            else
                return false;
        }
        return true;
    }
}