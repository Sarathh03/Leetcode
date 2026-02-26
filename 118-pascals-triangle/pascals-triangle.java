import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        for(int i =0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int col = 0; col <=i; col++){
                if(col ==0|| col==i){
                    row.add(1);
                }
                else{
                    List<Integer> previousrow = pascal.get(i-1);
                    row.add(previousrow.get(col)+previousrow.get(col-1));
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}