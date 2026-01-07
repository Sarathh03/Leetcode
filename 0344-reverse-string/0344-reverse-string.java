// class Solution {
//     public void reverseString(char[] s) {
//         ArrayList<Character> res = new ArrayList<>();
//         for(int i =0;i<s.length;i++){
//             res.add(s[i]);
//         }
//         Collections.reverse(res);
//         for(int i=0;i<s.length;i++){
//             s[i] = res.get(i);
//         }
//     }
// }


// below code using two pointers

 class Solution {
     public void reverseString(char[] s) {
        int i=0;
        int j= s.length-1;
        int c = s.length;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
     }
 }