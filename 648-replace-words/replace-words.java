class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word: words){
            String replacement  = word;
            dictionary.sort((a,b) -> a.length()-b.length());
            for(String root: dictionary){
                if(word.startsWith(root)){
                    replacement = root;
                    break;
                }
            }
            res.append(replacement).append(" ");
        }
        return res.toString().trim();
    }
}