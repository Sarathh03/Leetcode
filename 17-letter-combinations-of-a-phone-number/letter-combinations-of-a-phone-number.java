class Solution {
         String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<>();
        void  solve(String digits, int index, String temp){
            if(index == digits.length()){
                res.add(temp);
                return ;
            }
            int num = digits.charAt(index)-'0';
            String letter = arr[num];
            for(int i=0;i<letter.length();i++){
                char ch = letter.charAt(i);
                solve(digits,index+1,temp+ch);
            }
        }
        
    public List<String> letterCombinations(String digits) {
       if(digits.length() == 0){
        return res;
       }
       solve(digits,0,"");
       return res;
    }
}