class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int primarydia = 0;
        int secondarydia = 0;
        for(int i=0;i<mat.length;i++){
            primarydia += mat[i][i];
            if(i!=(n-1-i)){
                secondarydia += mat[i][n-1-i];
            }
        }
        return primarydia+secondarydia;
        
    }
}