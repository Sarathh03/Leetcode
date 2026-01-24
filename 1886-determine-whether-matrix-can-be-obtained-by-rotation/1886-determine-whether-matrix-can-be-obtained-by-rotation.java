class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int[][] rotatemat = new int[n][n];
        for(int k=0;k<4;k++){
            if(Arrays.deepEquals(mat,target)){
                return true;
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    rotatemat[j][n-1-i] = mat[i][j];
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    mat[i][j] = rotatemat[i][j];
                }
            }
        }
        return false;
    }
}