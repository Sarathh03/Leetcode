class Solution {
    public List<String> commonChars(String[] words) {

       List<String> res = new ArrayList<>();
       for(char i = 'a' ; i<= 'z';i++){
        int min = Integer.MAX_VALUE;
        for(int j=0;j<words.length;j++){
            int count = 0;
            for(int k = 0;k<words[j].length();k++){
                if(words[j].charAt(k) == i){
                    count++;
                }
            }
            min  = Math.min(min,count);
        }
            for(int v = 0;v<min;v++){
                res.add(String.valueOf(i));
            }
       }
        return res;
    }
}