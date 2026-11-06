class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        for(int i=0;i<strs[0].length();i++){
            char ch = strs[0].charAt(i);
            boolean match = true;
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || ch != strs[j].charAt(i)){
                    match = false;
                    break;
                }
            }
            if(match == false){
                break;
            }
            res += ch;
        }
        return res;
    }
}